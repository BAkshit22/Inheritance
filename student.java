/*Math(Pie,abs) Method
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
  class student{
	public static void main(String[] args) {
		studentDemo[] s1=new studentDemo[3];

		s1[0]=new studentDemo();
		s1[0].setdata(12,"XYZ",3);
		s1[1]=new studentDemo();
		s1[1].setdata(11,"ABC",6);
		s1[2]=new studentDemo();
		s1[2].setdata(10,"PQR",2);
        
        double x=Math.PI;
        System.out.println(x);
       
        double t=Math.abs(-7);
        System.out.print(t);

		for(studentDemo a:s1)//for each loop
		{
			a.printdata();
		}

		/*for (int i=0;i<s1.length;i++) {
			s1[i].printdata();
		}*/
	}
}
class studentDemo
{
    private int id,sem;
    private String name;


    void setdata(int id,String name,int sem)
    {
        this.id=id;
        this.name=name;
        this.sem=sem;
    }	
    void printdata()
    {
        System.out.println("Name : "+name+" Id : "+id+" Sem : "+sem);
    }
}