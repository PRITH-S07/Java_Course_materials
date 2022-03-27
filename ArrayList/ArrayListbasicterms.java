package example;
import java.io.*;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        ArrayList <String> s=new ArrayList<>();
        s.add("Ram");
        s.add("Jeff");
        s.add(1,"Chris");//to insert a particular element at an index
        System.out.println("Size of ArrayList is:"+s.size());//to get size of ArrayList
        for(int i=0;i<s.size();i++)
        {
            String k=(String)s.get(i);
            System.out.println(k);
        }
        Iterator itr=s.iterator();//using Iterator for traversing an ArrayList
        while(itr.hasNext())
        {
            String j=(String)itr.next();
            System.out.println("Using Iterator:"+j);
        }
        ListIterator<String> itrr=s.listIterator();// using ListIterator for traversing the ArrayList
        while(itrr.hasNext())
        {
            String j=(String)itrr.next();
            System.out.println("Using ListIterator:"+j);
        }
        ListIterator<String> itrrev=s.listIterator(s.size());// using ListIterator for traversing the ArrayList from the end
        while(itrrev.hasPrevious())
        {
            String j=(String)itrrev.previous();
            System.out.println("Using ListIterator(from reverse):"+j);
        }
        ArrayList<String> m = (ArrayList<String>) s.clone();//cloning the ArrayList
        for(int i=0;i<m.size();i++)
        {
            String k=(String)m.get(i);
            System.out.println("From the cloned list:"+k);
        }
        System.out.println("Does the ArrayList contain Mack?:"+s.contains("Mack"));
        System.out.println("Index of Ram in the list:"+s.indexOf("Ram"));
        System.out.println("Index of Sathish in the list:"+s.indexOf("Sathish"));
        s.remove(1);//to delete this element at this index
        System.out.println("After deletion:");
        for(int i=0;i<s.size();i++)
        {
            String k=(String)s.get(i);
            System.out.println(k);
        }
        s.clear();//removes everything from the list
        System.out.println("Size of ArrayList after clear() operation is:"+s.size());//to get size of ArrayList
        System.out.println(s.isEmpty());
    }
}


/* Output:
Size of ArrayList is:3
Ram
Chris
Jeff
Using Iterator:Ram
Using Iterator:Chris
Using Iterator:Jeff
Using ListIterator:Ram
Using ListIterator:Chris
Using ListIterator:Jeff
Using ListIterator(from reverse):Jeff
Using ListIterator(from reverse):Chris
Using ListIterator(from reverse):Ram
From the cloned list:Ram
From the cloned list:Chris
From the cloned list:Jeff
Does the ArrayList contain Mack?:false
Index of Ram in the list:0
Index of Sathish in the list:-1
After deletion:
Ram
Jeff
Size of ArrayList after clear() operation is:0
true */
