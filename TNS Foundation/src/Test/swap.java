package Test;
import java.util.Scanner;


public class swap {

	public static void main(String[] args) {
	  int a,b,temp;
	  System.out.println("Enter two number");
	  Scanner r = new Scanner(System.in);
	  a=r.nextInt();
	  b=r.nextInt();
	  System.out.println("Before Swapping"+a+" "+b);
	  temp=a;
	  a=b;
	  b=temp;
	  System.out.print("After swapping"+a+" "+b);
	  
	  

	}

}
