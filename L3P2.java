import java.util.*;
public class L3P2
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Square indicates case1, Rectangle indicates cases, circle indicates case 3");
int input=sc.nextInt();
switch(input)
{
case 1:
System.out.println("Enter the sides");
int sides=sc.nextInt();
int Square=4*sides;
System.out.println("perimeter of the square is" +Square);
break;
case 2:
System.out.println("enter the length and breadth");
int l=sc.nextInt();
int b=sc.nextInt();
int rect=2*(l+b);
System.out.println("perimeter of the circle is" +rect);
break;
case 3:
System.out.println("enter the rasdius");
int radius=sc.nextInt();
int circle=2*(22/7)*radius;
System.out.println("perimeter of the circle" +circle);
break;
default:
System.out.println("enter the valid inout");
break;
}
}
}