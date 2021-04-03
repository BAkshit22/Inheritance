/*indexOf, lastIndexOf & subString
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
import java.util.*;
public class employeeDemo
{
	public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		fullm f1=new fullm();

		e1.getdata(1,0000,"rajesh","B","shah");
		e1.setdata();
		e2.getdata(6,8000,"Aksh","B","bajaria");
		e2.setdata();
		System.out.print("\n"+e1.getfullname());
		System.out.print("\n"+e2.getfullname());

		//e1.getid(1);
		//e1.setid();
	}
}
class employee
{
	private int id,salary;
	private String fname,mname,lname;

	Scanner sc=new Scanner(System.in);

	String getfullname()
	{
		return fname +" "+ mname+" "+ lname;
	}

	void getdata(int id,int salary,String fname,String mname,String lname)
	{
		this.id=id;
		this.salary=salary;
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
	}
	void setdata()
	{
		System.out.print("Id = "+id);
		System.out.print("\nsalary = "+salary);
		System.out.print("\nFname = "+fname);
		System.out.print("\nMname = "+mname);
		System.out.print("\nLname = "+lname);
	}
     /*
     //Return Method
     void getid(int id)
     {
       this.id=id;
     }
	int setid()
	{
		return id;
	}
      
        void getsalary(int salary)
 {
       this.salary=salary;
 }
	int setsalary()
	{
		return salary;
	}
	void getfname(String fname)
	{
         this.fname=fname;
	}
	String setfname()
	{
		return fname;
	}
	void getmname(String mname)
	{
         this.mname=mname;
	}
	String setmname()
	{
		return mname;
	}
	void getlname(String lname)
	{
         this.lname=lname;
	}
	String setlname()
	{
		return lname;
	}*/
}
class fullm
{
	private String w,x,y,z;
	void setfname()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("\nEnter Your Full Name : ");
		w=sc.nextLine();

		int pos=w.indexOf(" ");
		//System.out.print(pos);

		x=w.substring(0,pos);
		//System.out.print("\nFirst Name : "+x);

		int pos2=w.lastIndexOf(" ");
		//System.out.print(pos2);

		int a=pos+1;
		y=w.substring(a,pos2);
		//System.out.print("\nMiddle Name : "+y);

		int len=w.length();
		int b=pos2+1;
		z=w.substring(b,len);
		//System.out.print("\nLast Name : "+z);
	}
	void getfname()
	{
		System.out.print("\nFirst Name : "+x);
		System.out.print("\nMiddle Name : "+y);
		System.out.print("\nLast Name : "+z);
		//return "\nFirst name : "+x+"\nMiddle Name : "+y+"\nLast Name : "+z;
	}
}