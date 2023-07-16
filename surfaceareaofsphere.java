package test1jul4th;
import java.util.Scanner;
public class surfaceareaofsphere {
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enetr a radius of sphere");
int  a=scan.nextInt();
double res=area(a);
System.out.println("the surface area of sphere is ="+res);
}
public static double area(int a)
{
return 2*a*3.14*4;
}
}
