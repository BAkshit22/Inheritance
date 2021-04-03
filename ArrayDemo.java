/*1> Array Sort Method
  2> Object Array
  3> Comparale
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
import java.util.*;

		class ArrayDemo
		{
		public static void main(String[] args) {
	    
	    String[] countries = {"Wood apple", "Blackberry", "Date", "Naseberry"};

         ProductDemo[] s1=new ProductDemo[2];

         for (int i=0;i<s1.length;i++)
         {
             s1[i]=new ProductDemo();
         }

         s1[0].Product(112,"xDettol",5);
         s1[0].printData();

         s1[1].Product(89,"Life_boy",10);
         s1[1].printData();

         Arrays.sort(s1);
         s1[0].printData();
         s1[1].printData();

         Arrays.sort(s1);    
         System.out.println(Arrays.toString(s1));  

		/*for (int i=0;i<x.length;i++) 
		{
		 System.out.println("Array "+i+" = "+x[i]);	
		}
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
*/
	}
}
class ProductDemo implements Comparable
{
   private int id,rate;
   private String name;

   void Product(int id,String name,int rate)
   {
       this.id=id;
       this.name=name;
       this.rate=rate;
   }
   void printData()
   {
   	 System.out.println("Id : "+id+"\nName : "+name+" \nRate : "+rate+"\n");
   }
   public int compareTo(Object s1)
   {
   	  ProductDemo x=(ProductDemo)s1;

   	  return id=x.id;
   }
   public String toString()
   {
   	return name;
   }

}