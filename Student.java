class Student
{
int id;
String name;
public Student(int id,String name)
{
this.id=id;
this.name=name;
}
int getId()
{
return id;
}
String getName()
{
return name;
}
}
class student1 extends Student {
public student1(int id, String name){
super(id, name);
}
}