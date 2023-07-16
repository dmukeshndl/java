package test1jul4th;
import java.util.Scanner;
public class semaveragemarks {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter sem1 marks ");
		int a =scan.nextInt();
		System.out.println("enter sem2 marks ");
		int b =scan.nextInt();
		System.out.println("enter sem3 marks ");
		int c =scan.nextInt();
		System.out.println("enter sem4 marks ");
		int d =scan.nextInt();
		System.out.println("enter sem5 marks ");
		int e =scan.nextInt();
		System.out.println("enter sem6 marks ");
		int f =scan.nextInt();
		System.out.println("enter sem7 marks ");
		int g =scan.nextInt();
		System.out.println("enter sem1 marks ");
		int h =scan.nextInt();
		float i=avg(a,b,c,d,e,f,g,h);
		System.out.println("the average marks of student in btech ="+i);
		
		
	}
public static float avg(int a,int b,int c,int d,int e,int f,int g,int h)
{
return(a+b+c+d+e+f+g+h)/8;	
}
}
