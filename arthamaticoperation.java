package test1jul4th;
import java.util.Scanner;
public class arthamaticoperation {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1 value");
		int num1=scan.nextInt();
		System.out.println("enter a num2 value");
		int num2=scan.nextInt();
		int a=sub(num1,num2);
		System.out.println("the substraction of num1 and num2 is ="+a);
		
		
		System.out.println("enter a num3 value");
		int num3=scan.nextInt();
		System.out.println("enter a num4 value");
		int num4=scan.nextInt();
		int b=mul(num3,num4);
		System.out.println("the multipication of num3 and num4 is ="+b);
		
		System.out.println("enter a num5 value");
		int num5=scan.nextInt();
		System.out.println("enter a num6 value");
		int num6=scan.nextInt();
		float c=div(num5,num6);
		System.out.println("the division of num5 and num6 is ="+c);
		
		System.out.println("enter a num7 value");
		int num7=scan.nextInt();
		System.out.println("enter a num8 value");
		int num8=scan.nextInt();
		int d=indiv(num7,num8);
		System.out.println("the module of num7 and num8 is ="+d);		
	}
	public static int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public static int mul(int num3,int num4)
	{
		return num3*num4;
	}
	public static int div(int num5,int num6)
	{
		return num5/num6;
	}
	public static int indiv(int num7,int num8)
	{
		return num7%num8;
	}

}
