package test1jul4th;
import java.util.Scanner;
public class temperatureconverter {
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("the temperature of a body in fahrenheit");
double f=scan.nextDouble();
double c =convert(f);
System.out.println("temperature of a body in celsius ="+c);
}
public static double convert(double f)
{
return ((f-32)*5/9);
}
}
