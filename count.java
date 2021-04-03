/*Counting Occurence of String
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
class count{ 
public static void main(String args[]) 
{ 
    String str="We will do it. We will be happier. We will .";
    String word="will"; 

	String a[] = str.split(" "); 	
	int count = 0; 
	for (int i = 0; i < a.length; i++) 
	{ 
	if (word.equals(a[i])) 
		{count++;} 
	} 
      
      System.out.print("Main String : We will do it. We will be happier. We will.");

      System.out.print("\nSearch String : will");

System.out.println("\nNo Of Count : "+count);
	 
} 
} 