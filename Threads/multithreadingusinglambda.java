package example;
import java.io.*;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        Thread t1=new Thread(() ->
        {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("hi");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
        });
        Thread t2=new Thread(() ->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("hello");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        t1.join();
        t2.start();
        t2.join();
        System.out.println(t1.isAlive());//to see if a thread is alive or not
        System.out.println("Bye");
    }
}

/* Output:
hi
hi
hi
hi
hi
hello
hello
hello
hello
hello
false
Bye
*/
