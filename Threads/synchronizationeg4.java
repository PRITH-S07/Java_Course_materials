package example;
import java.io.*;
import java.util.*;
class Counter
{
    int count;
    public synchronized void increment() //this enables both the threads to perform an increment unlike sometimes just one thread doing so
    {
        count++;
    }
}
public class practice
{
    public static void main(String[] args) throws Exception
    {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {
            public void run() {
                for(int i=1;i<=1000;i++)
                    c.increment();
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run() {
                for(int i=1;i<=1000;i++)
                    c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count:"+c.count);
    }
}

// Output: Count:2000
