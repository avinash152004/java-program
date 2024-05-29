import java.util.*;
class L3P3
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter A number:");
int a = obj.nextInt();
System.out.println("Enter B number:");
int b= obj.nextInt();
a +=b;
System.out.println("A +=B  :   "+a);
a -=b;
System.out.println("A -=B  :   "+a);
a *= b;
System.out.println("A *=B  :   "+a);
a /=b;
System.out.println("A /=B  :   "+a);
a %=b;
System.out.println("A %=B  :   "+a);
}
}