package example;
import java.io.*;
import java.sql.Array;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        String k="Tom";
        System.out.println(k.hashCode());//method in the object class, we are creating a hashcode for this particular object (key to a hashcode)
        //note an integer representation of the hashcode
        //given the initial array size is 16,
        System.out.println((15-1)&k.hashCode());//note the value 2 comes as the output
    }
}

/* Output:
84274
2 */
