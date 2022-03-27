package example;
import java.io.*;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        LinkedList<String> s=new LinkedList<String>();
        s.add("Ravi");
        s.add("Venkat");
        s.add("Mohan");
        s.push("Ram");
        ListIterator<String> itr=s.listIterator();
        while(itr.hasNext())
        {
            String j=(String) itr.next();
            System.out.println(j);
        }
        s.pop();
        System.out.println("After editing the LinkedList");
        itr=s.listIterator();
        while(itr.hasNext())
        {
            String j=(String) itr.next();
            System.out.println(j);
        }
    }
}

/* Output:
Ram
Ravi
Venkat
Mohan
After editing the LinkedList
Ravi
Venkat
Mohan */
