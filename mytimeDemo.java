/*Time Program(Adding Object Datatype with Other Object)
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class mytimeDemo
{
	public static void main(String[] args) {
		mytime t1=new mytime();
        mytime t2=new mytime();
		t1.settime(10,50,30);
		t2.settime(20,30,5);
		//t1.printtime();
		t1.add(20);
		t1.printtime();
		t1.add(5,30);
		t1.printtime();
		t1.add(t2);
		t1.printtime();
		//t1.getseconds(2,2,20);

	}
}
class mytime
{
	private int hours,min,sec;

	void settime(int hours,int min,int sec)
	{
        this.hours=hours;
        this.min=min;
        this.sec=sec;
	}
	void printtime()
	{
		System.out.println("HH:MM:SS || "+hours+":"+min+":"+sec);
	}
	
	void add(int sec)
	{
       this.sec=sec+this.sec;
         
       //System.out.print("\nHH:MM:SS || "+hours+":"+min+":"+sum);  
	}
	void add(int min,int sec)
	{
       this.sec=sec+this.sec;
       this.min=min+this.min;  
       //System.out.print("\nHH:MM:SS || "+hours+":"+sum1+":"+sum);	
	}
	void add(mytime t)
	{
       this.hours=this.hours+t.hours;
       this.min=this.min+t.min;
       this.sec=this.sec+t.sec;
      // System.out.print("\nHH:MM:SS || "+hsum+":"+msum+":"+ssum);
	}
}