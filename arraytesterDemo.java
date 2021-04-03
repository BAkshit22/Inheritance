/*Getting Coloumn from 2DArray 
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
class arraytesterDemo
{
	public static void main(String[] args) {
		arraytester a1=new arraytester();
        int[][] arr2D={ { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
       
        arraytester.getColumn(arr2D,0);		
	}
}
class arraytester
{
     public static int getColumn(int[][] x,int col)
     {
     	int a=0;
     for(int i = 0 ; i < x.length; i++){
     System.out.println(x[i][col]);
             }
             return a;
          }
         /*int noOfRows, int noOFColmuns;*/
}