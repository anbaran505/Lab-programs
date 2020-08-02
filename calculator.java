import java.util.Scanner;
class Arithmetic
{ int c;
  int add(int  a,int b)
  { c=a+b; 
  return c;
  }
  int sub(int  a,int b){  c=a-b; return c; }
  int mul(int  a,int b){ c=a*b; return c; }
  int div(int  a,int b){  c=a%b; return c; }
}
public class calculator
{
	public static void main(String[] args)
	{
	    int a,b,x;
	    Scanner s= new Scanner(System.in);
	    Arithmetic o=new Arithmetic();
	    System.out.println("Enter two numbers:");
	    a=s.nextInt();
	    b=s.nextInt();
	    System.out.println("ADD:"+o.add(a,b));
	    System.out.println("SUB:"+o.sub(a,b));
	    System.out.println("MUL:"+o.mul(a,b));
        System.out.println("DIV:"+o.div(a,b));
	}
}
