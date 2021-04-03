/*Final (class,method,datatype)
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class finalDemo
{
	public static void main(String[] args) {
		final1 f1=new final1(); 
		f1.xyz();
		temp t1=new temp();
		test t2=new test();
		t1.petrolprice();
		t2.petrolprice();
	}
}
final class final1
{
	private final int adult=18;

	void xyz()
	{
	    System.out.println("Minimum Age for Movies : "+adult);
		//adult=25;
		//System.out.println("Minimum Age for Movies : "+adult);
		//compile time error
	}

}

class temp //extends final1 //error compile time
{
     final void petrolprice()
      {
      	System.out.println("100 rs/liter");
      }
}
class test extends temp
{
	  /*void petrolprice()//will give compiel time error
      {
      	System.out.println("Petrol price are very low");
      }*/
}
