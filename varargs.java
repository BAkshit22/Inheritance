/*Variable Argument
  Made by : Akshit Bajaria
  Github id : BAkshit22
*/
import java.util.*;

class varargs
{
	public int addition(int ... args)
	{
		int sum=0;
		int a=args.length;
		for(int i=0;i<a;i++)
		{
			sum = sum + args[i];
		}
		//System.out.println(args.length);
		return sum;
	}
	public int average(int ... args)
	{
        int sum=0,x=0;
		int a=args.length;
		for(int i=0;i<a;i++)
		{
			sum = sum + args[i];

			x=sum/a;
		}
		//System.out.println(args.length);
		return x;
	}
	public int maximum(int ... args)
	{
		//int max = Collections.max(Arrays.asList(args));
		//return max;
		int max=args[0];
        int a=args.length;
		for(int i=0;i<a;i++)
		{
			if(args[i]>max)
			{
				max=args[i];
			}
		}
		return max;
    }
    public int minimum(int ... args)
	{
		//int min = Collections.min(Arrays.asList(args));
		//return min;
		int min=args[0];
        int a=args.length;
		for(int i=0;i<a;i++)
		{
			if(args[i]<min)
			{
				min=args[i];
			}
		}
		return min;
    }
	public static void main(String[] args)
	{ 
		varargs v1=new varargs();

		int y=v1.addition(10,5);
        System.out.print("Addition : "+y);

        int x=v1.average(45,55);
        System.out.print("\nAverage : "+x);

        int z=v1.maximum(78,9);
        System.out.print("\nMaximum : "+z);

        int w=v1.minimum(45,1);
        System.out.print("\nMinimum : "+w);
	}
}