package example;
import java.awt.*;
import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> h=new HashSet<String>();
        h.add("lemur");
        h.add("orangutan");
        h.add("capuchin");
        h.add("spider monkey");
        System.out.println(h);
        h.remove("orangutan");
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("spider monkey"));
        Iterator<String> it=h.iterator();
        while(it.hasNext())
        {
            System.out.println("Item:"+it.next());
        }
        h.clear();
        System.out.println(h);
        System.out.println(h.isEmpty());
    }
}

/* Output:
[lemur, spider monkey, capuchin, orangutan]
[lemur, spider monkey, capuchin]
3
true
Item:lemur
Item:spider monkey
Item:capuchin
[]
true
 */
