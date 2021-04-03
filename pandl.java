/*Profit or Loss On sale of Product
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
import java.util.*;

class pandl
{
	public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in); 
        int cost,sales;
        System.out.print("Enter Product Cost : ");
        cost = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        sales = sc.nextInt(); 

        if(cost>sales)
        {
        	int loss,lossper;

        	loss=cost-sales;
            
            lossper=loss*100/cost;
               
             System.out.print("Cost : "+cost+"\tLoss Amount : "+loss+"\nSales : "+sales+"\tLoss % : "+lossper);
        }
        else
        {
        	int profit,profitper;

        	profit=sales-cost;
            
            profitper=profit*100/cost;
             
            System.out.print("Cost : "+cost+"\tProfit Amount : "+profit+"\nSales : "+sales+"\tProfit % : "+profitper); 	
        }	
    } 
}