import java.util.*;
class Program3
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
try
{
System.out.println("Enter A number:");
int a = obj.nextInt();
System.out.println("Enter B number:");
int b = obj.nextInt();
int A=a+b;
System.out.println("A+B =" +A);
int S=a-b;
System.out.println("A-B =" +S);
int M=a*b;
System.out.println("A*B =" +M);
int D=a/b;
System.out.println("A/B =" +D);
}
catch (Exception e)
{
obj.close();
}
}
}