import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    {
    int n;
    boolean x = false;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number");
    n=s.nextInt();
    for(int i=2;i<=n/2;++i)
    {
    if(n%i==0)
    {
        x=true;
        break;
    }
    }
    if(!x)
    System.out.println("It is a prime no");
    else
    System.out.println("It is not a prime no");
}    
}

    