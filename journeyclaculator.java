package test1jul4th;
import java.util.Scanner;
public class journeyclaculator {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed of vehicle");
		float a=scan.nextFloat();
		System.out.println("enter the time of vehical");
		float b=scan.nextFloat();
		float c=cal(a,b);
		System.out.println("the distance cleared by the vehical is = "+c+"km");
	}
public static float cal(float a,float b)
{
return a*b;	
}

}
