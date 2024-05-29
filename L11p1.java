import java.util.*;
public class L11p1
{
public static void main(String[] args) 
{
LinkedList<String> s1 = new LinkedList<String>();
s1.add("Red");
s1.add("Green");
s1.add("Orange");
s1.add("White");
s1.add("Black");
System.out.println("The element are: " +s1);
System.out.println("The first element is : " +s1.getFirst());
System.out.println("The last element is : " + s1.getLast());
}
}
