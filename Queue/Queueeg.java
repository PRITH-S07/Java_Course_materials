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
        Queue<String> bbq=new LinkedList<String>();
        bbq.add("2pac");
        bbq.add("Biggie");
        bbq.add("Eazy-E");
        System.out.println(bbq.peek());
        System.out.println(bbq);
        bbq.poll();
        System.out.println(bbq);
        bbq.poll();
        System.out.println(bbq);
        System.out.println(bbq.contains("Eazy-E"));
        bbq.add("2pac");
        bbq.add("Biggie");
        System.out.println(bbq);
        System.out.println(bbq.toArray()[1]);
        System.out.println(bbq.poll());
    }
}

/* Output:
2pac
[2pac, Biggie, Eazy-E]
[Biggie, Eazy-E]
[Eazy-E]
true
[Eazy-E, 2pac, Biggie]
2pac
Eazy-E */
