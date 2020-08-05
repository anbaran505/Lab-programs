import java.util.Scanner;
public class max
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		if (a<b)
		  System.out.println("b is Maximum");
		else if(a==b)
		   System.out.println("neither a nor b is Maximium");
		else  
		   System.out.println("a is Maximum");
		   
		
	}
}
