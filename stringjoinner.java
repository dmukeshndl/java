package test1jul4th;
import java.util.Scanner;
public class stringjoinner {
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter first word");
String a=scan.next();
System.out.println("enter second word");
String b=scan.next();
String c=join(a);
String d=joint(b);
System.out.println("the result is "+'"'+(c+","+d)+'"');
}
public static String join(String a)
{
return a;

}
public static String joint(String b)
{
return b;

}
}
