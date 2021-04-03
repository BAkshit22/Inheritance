/*Inheritance with toString Method Override
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class PersonDemo
{
	public static void main(String[] args) {
		Employee e1=new Employee(20000,5,"Akshit",36);
		Student s1=new Student("Commerce",10,"Karna",45);

		e1.printDetails();
        e1.toString();
		s1.printDetails();
		s1.toString();

	}
}
abstract class Person
{
   private int id,description;
   private String name;

   Person(int id,String name,int description)
   {
        this.id=id;
        this.name=name;
        this.description=description;
   }
   public String toString()
   {
        return "Id : "+id+"\nDescription : "+description+"\nName : "+name;
   }
   abstract void printDetails();
}
class Employee extends Person
{
	private int salary;

	Employee(int salary,int id,String name,int description)
 	{
        super(id,name,description);
        this.salary=salary;
	}
	void printDetails()
	{
		System.out.println(super.toString() +"\nSalary : "+salary);
	}
	public String toString()
 	{
        return super.toString() + "Salary : "+salary;
	}
}
class Student extends Person
{
	private String education;

	Student(String education,int id,String name,int description)
 	{
        super(id,name,description);
        this.education=education;
	}
	void printDetails()
	{
		System.out.println(super.toString() +"\nEducation : "+education);
	}
	public String toString()
 	{
        return super.toString() + " Education : "+education;
	}
}