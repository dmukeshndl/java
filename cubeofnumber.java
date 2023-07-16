package test1jul4th;
import java.util.Scanner;
public class cubeofnumber {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int a=scan.nextInt();
		int b=square(a);
		System.out.println("the square value is "+b);
		
		
		
	}
	public static int square(int a)
	{
		return a*a*a;
		
	}

}

