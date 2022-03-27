package example;
import java.io.*;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        student s1=new student("Satish","123");
        student s2=new student("Ram","124");
        ArrayList <student> myclass=new ArrayList<student>();
        myclass.add(s1);
        myclass.add(s2);
        Iterator<student> itr=myclass.iterator();
        while(itr.hasNext())
        {
            student t=(student) itr.next();
            System.out.println(t.name+t.regno);
        }
    }
}
class student
{
    String name;
    String regno;
    public student(String name, String regno)
    {
        this.name=name;
        this.regno=regno;
    }
    public void display()
    {
        System.out.println(name+regno);
    }
}

/* Output:
Satish123
Ram124 */
