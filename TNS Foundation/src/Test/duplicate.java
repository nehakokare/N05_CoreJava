package Test;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		String s1 = r.next();
		int[] count = new int[256];
		for(int i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(count[i]>1)
			{
				System.out.println((char)(i)+" count = "+count[i]);
				
			}
		}
		

	}

}
