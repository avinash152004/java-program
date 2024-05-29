import java.util.*;
public class Program1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("do you want to find the radius or not?");
String s=sc.nextLine().toLowerCase();
if(s.equals("yes"))
{
System.out.println("enter the radius");
double a=sc.nextDouble();
double area=a*a*Math.PI;
System.out.println("The area of the circle" +a+ "is" +area);
break;
}
else if(s.equals("no")){
break;
}
else{
System.out.println("invakid inout");
}
}
}
}