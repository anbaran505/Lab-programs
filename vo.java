import java.util.Scanner;
class vol
{
    int w,h,d;
}
public class vo
{
	public static void main(String[] args)
	{    int v;
		Scanner s=new Scanner(System.in);
		vol o =new volume();
		System.out.println("enter width:");
		 o.w=s.nextInt();
		System.out.println("enter height:");
		 o.h=s.nextInt();
		System.out.println("enter depth:");
		 o.d=s.nextInt();
		v=o.w*o.h*o.d;
		System.out.println("the volume is:"+v);
		
	}
}