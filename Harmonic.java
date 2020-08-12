package harmonic;

import java.util.Scanner;
public class Harmonic {

    
    static double n;
    static  double s=0;
    static int Harmonic(double n)
    {
        while(n>0)
        {
            s=s+1/n;
            n--;
        }
        System.out.println("The harmonic series value is :"+s);
        return 0;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the number to generate harmonic series ");
        Scanner obj=new Scanner(System.in);
        Harmonic.n=obj.nextDouble();
        Harmonic(Harmonic.n);
        
        
        
        
    }
    
}