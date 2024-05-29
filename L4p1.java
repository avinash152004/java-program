import java.util.*;
public class L4p1
{
public static void main(String arg[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter one side length value:");
int length = obj.nextInt();
int f = 4;
int area = length*length;
int per = f*length;
System.out.println(" ");
System.out.println("The area of square is:" +area);
System.out.println("The perimeter of the square is:"+ per);
}
}