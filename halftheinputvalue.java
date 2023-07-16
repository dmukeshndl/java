package test1jul4th;
import java.util.Scanner;
public class halftheinputvalue 
{	
		public static void main(String[]args)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the value");
				float a=scan.nextFloat();
				float res=half(a);
				System.out.println("the half value is ="+res);
				
}
		public static float half(float a)
		{
			return a/2;
		}
}