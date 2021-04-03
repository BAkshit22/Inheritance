/*Movie Booking Program(JOptionPane,Switch Case,If..Else) 
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
import java.util.*;
import javax.swing.JOptionPane;

class movie
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int x,time;
		double total;
		int general,senior=0,child=0,adult;
        JOptionPane.showMessageDialog(null,"You Are About To Enter Movie Program");
        System.out.print("---------*****---------*****---------*****---------*****---------*****---------");
        System.out.print("\n\t\t\t\tWelcome to Movie-Ticket Program! ");
        System.out.print("\n---------*****---------*****---------*****---------*****---------*****---------");
        System.out.print("\n 1> The Invisible Man\n 2> Impractical Jokers\n 3> The Call Of The Wild\n 4> Sonic The Hedgehog\n 5> Fantasy Island\n Enter Your Choice : ");
        x=sc.nextInt();

        switch(x)
        {
        	case 1 : 

        	System.out.print("X-------Time--------X---------X---------X--Price--X---------X---------X---------X---Age---X---------X");
            System.out.print("\n 1> IMAX 1:00-3:00\t\tGeneral $20.99 Senior $19.50 child $18.5\tGeneral | 14-64\n 2> VIP 2:30-4:30\t\tAdult $19.99\t\t\t\t\tSenior  | 65+ \n 3> ULTRAAVX 2:30-4:30\t\tGeneral $17.99 Senior $14.50 child $13.5\tAdult   | 18+ \n 4> REGULAR 4:45-6:45\t\tGeneral $11.99 Senior $8.50 child $7.75 \tChild   | 3-13");
            System.out.print("\nEnter Show Time : ");
            time=sc.nextInt();
            switch(time)
            {
            	case 1:
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                	JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*20.99)+(senior*19.5)+(child*18.5);
                if(total<=0)
                {
                	JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;

                case 2 :
                
                System.out.print("Enter Number Of Adult Ticket : ");
                adult=sc.nextInt();

                if(adult>0)
                {
                    total=adult*19.99;
                    System.out.print("Your Total Amount = "+total+"$");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                break;

                case 3 :
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*17.99)+(senior*14.5)+(child*13.5);
                if(total<0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                
                case 4:

                  System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*11.99)+(senior*8.5)+(child*7.75);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                default :
                JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
            }
            break;

            case 2 : 

        	System.out.print("X-------Time--------X---------X---------X--Price--X---------X---------X---------X---Age---X---------X");
            System.out.print("\n 1> IMAX 1:00-3:00\t\tGeneral $20.99 Senior $19.50 child $18.5\tGeneral | 14-64\n 2> VIP 2:30-4:30\t\tAdult $19.99\t\t\t\t\tSenior  | 65+ \n 3> ULTRAAVX 2:30-4:30\t\tGeneral $17.99 Senior $14.50 child $13.5\tAdult   | 18+ \n 4> REGULAR 4:45-6:45\t\tGeneral $11.99 Senior $8.50 child $7.75 \tChild   | 3-13");
            System.out.print("\nEnter Show Time : ");
            time=sc.nextInt();
            switch(time)
            {
                case 1:
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*20.99)+(senior*19.5)+(child*18.5);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;

                case 2 :
                
                System.out.print("Enter Number Of Adult Ticket : ");
                adult=sc.nextInt();

                if(adult>0)
                {
                    total=adult*19.99;
                    System.out.print("Your Total Amount = "+total+"$");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                break;

                case 3 :
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*17.99)+(senior*14.5)+(child*13.5);
                if(total<0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                
                case 4:

                  System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*11.99)+(senior*8.5)+(child*7.75);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                default :
                JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
            }
            break;

            case 3 : 

        	System.out.print("X-------Time--------X---------X---------X--Price--X---------X---------X---------X---Age---X---------X");
            System.out.print("\n 1> IMAX 1:00-3:00\t\tGeneral $20.99 Senior $19.50 child $18.5\tGeneral | 14-64\n 2> VIP 2:30-4:30\t\tAdult $19.99\t\t\t\t\tSenior  | 65+ \n 3> ULTRAAVX 2:30-4:30\t\tGeneral $17.99 Senior $14.50 child $13.5\tAdult   | 18+ \n 4> REGULAR 4:45-6:45\t\tGeneral $11.99 Senior $8.50 child $7.75 \tChild   | 3-13");
            System.out.print("\nEnter Show Time : ");
            time=sc.nextInt();
            switch(time)
            {
                case 1:
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*20.99)+(senior*19.5)+(child*18.5);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;

                case 2 :
                
                System.out.print("Enter Number Of Adult Ticket : ");
                adult=sc.nextInt();

                if(adult>0)
                {
                    total=adult*19.99;
                    System.out.print("Your Total Amount = "+total+"$");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                break;

                case 3 :
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*17.99)+(senior*14.5)+(child*13.5);
                if(total<0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                
                case 4:

                  System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*11.99)+(senior*8.5)+(child*7.75);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                default :
                JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
            }
            break;

            case 4 : 

        	System.out.print("X-------Time--------X---------X---------X--Price--X---------X---------X---------X---Age---X---------X");
            System.out.print("\n 1> IMAX 1:00-3:00\t\tGeneral $20.99 Senior $19.50 child $18.5\tGeneral | 14-64\n 2> VIP 2:30-4:30\t\tAdult $19.99\t\t\t\t\tSenior  | 65+ \n 3> ULTRAAVX 2:30-4:30\t\tGeneral $17.99 Senior $14.50 child $13.5\tAdult   | 18+ \n 4> REGULAR 4:45-6:45\t\tGeneral $11.99 Senior $8.50 child $7.75 \tChild   | 3-13");
            System.out.print("\nEnter Show Time : ");
            time=sc.nextInt();
            switch(time)
            {
                case 1:
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*20.99)+(senior*19.5)+(child*18.5);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;

                case 2 :
                
                System.out.print("Enter Number Of Adult Ticket : ");
                adult=sc.nextInt();

                if(adult>0)
                {
                    total=adult*19.99;
                    System.out.print("Your Total Amount = "+total+"$");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                break;

                case 3 :
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*17.99)+(senior*14.5)+(child*13.5);
                if(total<0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                
                case 4:

                  System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*11.99)+(senior*8.5)+(child*7.75);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                default :
                JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
            }
            break;

            case 5 : 

        	System.out.print("X-------Time--------X---------X---------X--Price--X---------X---------X---------X---Age---X---------X");
            System.out.print("\n 1> IMAX 1:00-3:00\t\tGeneral $20.99 Senior $19.50 child $18.5\tGeneral | 14-64\n 2> VIP 2:30-4:30\t\tAdult $19.99\t\t\t\t\tSenior  | 65+ \n 3> ULTRAAVX 2:30-4:30\t\tGeneral $17.99 Senior $14.50 child $13.5\tAdult   | 18+ \n 4> REGULAR 4:45-6:45\t\tGeneral $11.99 Senior $8.50 child $7.75 \tChild   | 3-13");
            System.out.print("\nEnter Show Time : ");
            time=sc.nextInt();
            switch(time)
            {
                case 1:
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*20.99)+(senior*19.5)+(child*18.5);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;

                case 2 :
                
                System.out.print("Enter Number Of Adult Ticket : ");
                adult=sc.nextInt();

                if(adult>0)
                {
                    total=adult*19.99;
                    System.out.print("Your Total Amount = "+total+"$");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                break;

                case 3 :
                System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*17.99)+(senior*14.5)+(child*13.5);
                if(total<0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                
                case 4:

                  System.out.print("Enter Number Of General Ticket : ");
                general=sc.nextInt();
                if(general>=0)
                {
                System.out.print("Enter Number Of Senior Ticket : ");
                senior=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                if(senior>=0)
                {
                System.out.print("Enter Number Of Child Ticket : ");
                child=sc.nextInt();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry Number Of Ticket Can't be Negative :(");
                }
                total=(general*11.99)+(senior*8.5)+(child*7.75);
                if(total<=0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry Your Ticket price Can't be printed :(");
                }
                else
                {
                   System.out.print("Your Total Amount = "+total+"$"); 
                }
                break;
                default :
                JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
            }
            break;
            
            default :
            JOptionPane.showMessageDialog(null,"Sorry You Entered Wrong Choice :(");
        }
	}
}