package example;
import java.awt.*;
import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.sql.Array;
import java.util.*;
class Q
{
    int num;
    boolean valueSet=false;
    public synchronized void put(int num)
    {
        while(valueSet)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Put :"+num);
        this.num=num;
        valueSet=true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueSet)
        {
            try{wait();}catch (Exception e){}
        }
        System.out.println("Get :"+num);
        valueSet=false;
        notify();
    }
}

class Producer implements Runnable
{
    Q q;
    public Producer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while(true)
        {
            q.put(i++);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}

class Consumer implements Runnable
{
    Q q;
    public Consumer(Q q)
    {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }
    }
}

public class practice
{
    public static void main(String[] args) throws Exception
    {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}


/* Output:
Put :0
Get :0
Put :1
Get :1
Put :2
Get :2
Put :3
Get :3
Put :4
Get :4
Put :5
Get :5
Put :6
Get :6
Put :7
Get :7
Put :8
Get :8
Put :9
Get :9
Put :10
Get :10
Put :11
Get :11
Put :12
Get :12
Put :13
Get :13
Put :14
Get :14
Put :15
Get :15
Put :16
Get :16
Put :17
Get :17
Put :18
Get :18
Put :19
Get :19
Put :20
Get :20
*/
