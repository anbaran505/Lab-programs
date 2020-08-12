
import java.util.*;
class Book{
    String Bookname;
    class author{
    String name;
    String mail;
    String gender;
}
    double price;
    int qnt;
    void scan(){
    author a=new author();    
    Scanner s=new Scanner(System.in);
    System.out.println("enter the author name:");
    a.name=s.nextLine();
     System.out.println("enter the mail:");
    a.mail=s.nextLine();
     System.out.println("enter the gender:");
    a.gender=s.nextLine();
     System.out.println("enter the Bookname:");
    Bookname=s.nextLine();
     System.out.println("enter the price:");
    price=s.nextDouble();
     System.out.println("enter the qnt:");
    qnt=s.nextInt();
        System.out.println(a.name+a.mail+a.gender+Bookname+price+qnt);
    }
}

public class Main
{
	public static void main(String[] args) {
		Book obj=new Book();
	    obj.scan();
	}
}
