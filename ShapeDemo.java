/*Comparable with Object Array
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class ShapeDemo
{
	public static void main(String[] args) {
		Square s1=new Square(20);
		Square s2=new Square(10);
		s1.area(); 
		s2.area();

		int[] x=new int[5];

		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;

		for (int i=0;i<x.length;i++) 
		{
		 System.out.println("Array "+i+" = "+x[i]);	
		}

		System.out.println(s1.compareTo(s2));

	}
}
class Square implements Comparable  
{
   private int length;
   
   Square(int length)
   {
   	this.length=length;
   }

   void area()
   {
      System.out.println("Area : "+length*length);
   }

   public int compareTo(Object s2)
   {
   	  Square x=(Square)s2;
      if (length==x.length) 
      {
         return 0;	
      }
      else if(length>x.length)
      {
      	return 1;
      }
      else 
      {
      	return -1;
      }
   }
}