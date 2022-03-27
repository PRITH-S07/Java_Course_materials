package example;
import java.io.*;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        ArrayList <String> s=new ArrayList<String>();
        s.add("Ram");
        s.add("Jeff");
        s.add(1,"Chris");//to insert a particular element at an index
        ArrayList <String> name=new ArrayList<String>();
        name.add("Ele1");
        name.add("Ele2");
        name.addAll(s);//adding all the elements from 's' to 'name'
        name.removeAll(s);
        /*System.out.println("Size of ArrayList is:"+s.size());//to get size of ArrayList*/
        ListIterator <String> itr=name.listIterator();
        while(itr.hasNext())
        {
            String j=(String)itr.next();
            System.out.println(j);
        }
    }
}

/* Output:
Ele1
Ele2 */
