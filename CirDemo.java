/*Using method outside Class & toString Method
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
public class CirDemo
{
   public static void main(String[] args) {
   	   	    Square s1=new Square(13);
   	    Rectangle r1=new Rectangle(5,20);

   	    System.out.println(s1.area());
   	    System.out.println(r1.areaOfRect());
   	    System.out.println(s1.toString());
   	    System.out.println(r1.toString());
   	}	
}
class Circle
{
	private final double phi=3.14;
    private int radius;

    Circle(int radius)
    {
       this.radius=radius;
    }

    void setRadius(int radius)
    {
     this.radius=radius;
    }
   
    int getRadius()
    {
       return radius;
    }

    double area()
    {
    	return phi*radius*radius;
    }
}
class Square
{
    private int length;

    Square(int length)
    {
      this.length=length;
    }
    void setLength(int length)
    {
     this.length=length;
    }
   
    int getLength()
    {
       return length;
    }

    final int area()
    {
    	return length*length;
    }
    public String toString()
    {
    	return "Length : "+length;
    }
}
class Rectangle extends Square
{
    private int breadth;

    Rectangle(int breadth,int length)
    {
      super(length);
      this.breadth=breadth;
    }
    void setBreadth(int breadth)
    {
     this.breadth=breadth;
    }
   
    int getBreadth()
    {
       return breadth;
    }

    int areaOfRect()
    {
    	return getLength()*breadth;
    }

    public String toString()
 	{
        return super.toString() + "\nBreadth : "+breadth;
	}
}