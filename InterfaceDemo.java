/*Interface for shape
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class InterfaceDemo
{
	public static void main(String[] args) {
		shape c1=new circle();
		shape s1=new square();
       
		c1.draw();
		c1.area();

		s1.draw();
		s1.area();
	}
}

interface shape
   {
   	double PHI=3.14;
   	void draw();
   	void area();
   }

class circle implements shape
{
   private int radius=14;

   public void draw()
   {
      System.out.println("Draw Circle");
   }
   public void area()
   {
      System.out.println("Area Of Circle : "+(radius*radius*PHI));
   }
}
class square implements shape
{
   private int length=5;

   public void draw()
   {
      System.out.println("Draw Square");
   }
   public void area()
   {
      System.out.print("Area Of Square : "+(length*length));
   }
}