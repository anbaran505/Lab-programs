import java.util.Scanner;
class studen
{
    int s1,s2,s3;
        
    void getdata()
    {
    System.out.println("enter marks of three subjects");
    Scanner s=new Scanner(System.in);
    s1=s.nextInt(); 
	s2=s.nextInt();
	s3=s.nextInt();
	}
	void markcal()
	{
	    int avg;
	    avg=s1+s2+s3/3;
	    
	}
	void display()
	{
	System.out.println("The avg is:"+avg);
	if(avg>40)
	   System.out.println("Pass");
	else 
	    System.out.println("Fail");
	    
	}
}
public class students
{
	public static void main(String[] args)
	{
	   studen o[]=new studen[10];
	   int i;
	   for(i=0;i<10;i++)
	   {
	       o[i]=new studen();
	       o[i].getdata();
	       o[i].markcal();
	   }
	   for(i=0;i<10;i++)
	   {
	       o[i]=new studen();
	       o[i].display();
	   }
	  
	}
} 
