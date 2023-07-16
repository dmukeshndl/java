package test1jul4th;
import java.util.Scanner;
public class inchestofeet {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the height in inches");
		float h=scan.nextFloat();
		float res=hei(h);
		System.out.println("the height is in feet ="+res);
	}
	public static float hei(float h)
	{
		return h/12;
	}
}
