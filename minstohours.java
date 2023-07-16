package test1jul4th;
import java.util.Scanner;
public class minstohours {
	
		public static void main(String[]args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the time in min");
			float a=scan.nextFloat();
			float res=con(a);
			System.out.println("the time in hours ="+res);
}
		public static float con(float a)
		{
			return a/60;
		}
}