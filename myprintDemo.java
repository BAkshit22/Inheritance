/*Change of String(with index Value)
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
class myprintDemo
{
       public static void main(String[] args) {
	       myprint p1=new myprint();

	       p1.printline();
	       p1.printline(15);
	       p1.printline(10,'?');
        }
}
class myprint
{
      private int n;
      private char ch;

      void printline()
      {
         for(int i=0;i<20;i++)
         {
            System.out.print("*");
         }
         System.out.println();
      } 
      void printline(int n)
      {
      	this.n=n;
      	for(int i=0;i<n;i++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      void printline(int n,char ch)
      {
      	this.n=n;
      	this.ch=ch;

        for(int i=0;i<n;i++)
         {
            System.out.print(ch);
         }
         System.out.println();	
      }
}