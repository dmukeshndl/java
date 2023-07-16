package test1jul4th;
import java.util.Scanner;
public class doublethevalue {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any value");
		int a=scan.nextInt();
		int b=doub(a);
		System.out.println("the double value is = "+b);
	}
	public static int doub(int a)
	{
		return 2*a;
	}
}
