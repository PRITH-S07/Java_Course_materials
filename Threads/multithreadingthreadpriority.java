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
                    System.out.println("hi "+ Thread.currentThread().getPriority());//currentThread() method refers to the current thread
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
        });//adding "Hi Thread" after '}' here too is another way to modify the thread name
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
        System.out.println(t1.getName());// to get the name of the thread, default= Thread-0
        System.out.println(t2.getName());// to get the name of the thread, default= Thread-1
        t1.setName("Hi Thread");// to change/modify the thread name
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());// to give the priority of the thread
        System.out.println(t2.getPriority());// to give the priority of the thread, generally for both t1 and t2, it would be '5'
        // Note range of thread priority is from 1 to 10. 1->least priority, 10-> highest priority, 5->medium priority.
        t1.setPriority(1);// to set the thread priority
        // could also use: Thread.MIN_PRIORITY, Thread.NORM_PRIORITY and Thread.MAX_PRIORITY instead of 1, 5 and 10 respectively.

        t2.setPriority(10);
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

/*Output:
Thread-0
Thread-1
Hi Thread
Hello Thread
5
5
hi 1
hi 1
hi 1
hi 1
hi 1
hello
hello
hello
hello
hello
false
Bye
*/
