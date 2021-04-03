/*Abstract Method(shape program) & Final keyword
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/

public class AbstDemo
{
	public static void main(String[] args) {
		Abst a1= new Circle(22.0);
		Abst a2= new Sqaure(15,36);

		a1.draw();
		a1.area();
		a2.draw();
		a2.area();
	}
}
abstract class Abst
{
   final double PHI=3.14;
   abstract void draw();
   abstract void area();
}
class Circle extends Abst
{
	private double radius;

    Circle(double radius)
    {
        this.radius=radius;
    }

	void draw()
	{
		System.out.println("Circle is shape :)");
	}
	void area()
	{
       double a=PHI*radius*radius;
       System.out.println("Area Of Circle : "+ a);
	}
}
class Sqaure extends Abst
{
    private int length,breadth;
	
    Sqaure(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

	void draw()
	{
		System.out.println("Sqaure is shape :)");
	}
	void area()
	{
       int a=length*breadth;
       System.out.println("Area Of Sqaure : "+ a);
	}
}