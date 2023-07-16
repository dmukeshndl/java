package test1jul4th;
import java.util.Scanner;
public class finacecalculator {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter principal amount");
		double b=scan.nextDouble();
		System.out.println("enter rate of intrest");
		double c=scan.nextDouble();
		System.out.println("enter duration time");
		double d=scan.nextDouble();
		double e=cal(b,c,d);
		System.out.println("the simple intrest is ="+e);
}
	public static double cal(double b,double c,double d)
	{
		return b*c*d;
	}
}