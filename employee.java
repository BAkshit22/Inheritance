/*Inheritance Concept
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class employee
{
	public static void main(String[] args) {
		employeeDemo e1=new employeeDemo();
		manager m1=new manager();
		m1.setmanagerData(1,50230,"ABC",20000);
		m1.printData();
		e1.setEmployeeDetails(12,45000,"XYZ");
		e1.printData();
        System.out.println(e1);
        System.out.println(m1);
	}
}
class employeeDemo
{
	private int id,salary;
	private String name;

	void setEmployeeDetails(int id,int salary,String name)
	{
        this.id=id;
        this.salary=salary;
        this.name=name;
	}
	void printData()
	{
        System.out.print("\nName : "+name+"\tSalary : "+salary+"\tId : "+id);
	}
	public String toString()
 	{
        return "\nId : "+id+" Name : "+name+" Salary : "+salary;
	}
}
class manager extends employeeDemo 
{
	private int bonus;

	void setmanagerData(int id,int salary,String name,int bonus)
	{
        setEmployeeDetails(id,salary,name);
        this.bonus=bonus;
	}
	void printData()
	{
		super.printData();
		System.out.print("\tBonus : "+bonus);
	}
		public String toString()
 	{
        return super.toString() + " Bonus : "+bonus;
	}
}