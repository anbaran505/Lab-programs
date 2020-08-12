package max;


import java.util.Scanner;
public class staticMax3 {

    
    static int x,y,z;
    static  double a,b,c;
    static int  max3(int x,int y,int z)
    {
        
              if(x>y && x>z)
              {
                   System.out.println("Largest number is"+x);
                   
              }
              else if(y>z)
              {
                  System.out.println("Largest number is"+y);
              }
              else
              {
                  System.out.println("Largest number is"+z);
              }
           return 1;
                  
    }
    static  double max3(double a,double b,double c)
    {
          if(a>b && a>c)
              {
                   System.out.println("Largest number is"+a);
                   
              }
              else if(b>c)
              {
                  System.out.println("Largest number is"+b);
              }
              else
              {
                  System.out.println("Largest number is"+c);
              }
          return 0;
    }
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        int a;
        
        System.out.println("Enter 3 numbers to find the biggest one");
         System.out.println("Enter the x value");
        staticMax3.x= obj.nextInt();
         System.out.println("Enter the y value");
        staticMax3.y=obj.nextInt();
        System.out.println("Enter the z value");
        staticMax3.z=obj.nextInt();
         
        staticMax3.max3(staticMax3.x,staticMax3.y,staticMax3.z);
        System.out.println("To find the largest by overloading Enter 3 numbers:");
        
        
        System.out.println("Enter a value");
         staticMax3.a= obj.nextDouble();
         System.out.println("Enter b value");
         staticMax3.b=obj.nextDouble();
        System.out.println("Enter c value");
        staticMax3.c=obj.nextDouble();
         staticMax3.max3( staticMax3.a,staticMax3. b,staticMax3. c); 
        
           
        
        
    }
    
}
