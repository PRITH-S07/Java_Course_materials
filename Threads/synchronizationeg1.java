package example;
import java.io.*;
import java.util.*;
class Printer{
    void printDocuments(int numOfCopies,String docName){
        for(int i=1;i<=numOfCopies;i++){
            try {
                Thread.sleep(500);//temporarily pauses execution
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}
class MyThread extends Thread{
    Printer pRef;
    MyThread(Printer p)
    {
        pRef=p;
    }
    @Override
    public void run(){
        pRef.printDocuments(10,"JohnsProfile.pdf");
    }
}
class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p)
    {
        pRef=p;
    }
    @Override
    public void run(){
        pRef.printDocuments(10,"FionnasProfile.pdf");
    }
}
public class practice
{
    public static void main(String args[]) {
        System.out.println("===Application started===");
        Printer printer=new Printer();
        //printer.printDocuments(10,"ABCsprofile.pdf");
        //Here, scenario is that we have multiple threads working on the same printer object
        MyThread mRef=new MyThread(printer);
        YourThread yRef=new YourThread(printer);
        mRef.start();
        try {
            mRef.join();//thread synchronization
            // practically putting join on each and every method call is very tedious and is a little unnecessary
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        yRef.start();
        System.out.println("===Application finished===");
    }
}

/* Sample output:
===Application started===
>> Printing JohnsProfile.pdf 1
>> Printing JohnsProfile.pdf 2
>> Printing JohnsProfile.pdf 3
>> Printing JohnsProfile.pdf 4
>> Printing JohnsProfile.pdf 5
>> Printing JohnsProfile.pdf 6
>> Printing JohnsProfile.pdf 7
>> Printing JohnsProfile.pdf 8
>> Printing JohnsProfile.pdf 9
>> Printing JohnsProfile.pdf 10
===Application finished===
>> Printing FionnasProfile.pdf 1
>> Printing FionnasProfile.pdf 2
>> Printing FionnasProfile.pdf 3
>> Printing FionnasProfile.pdf 4
>> Printing FionnasProfile.pdf 5
>> Printing FionnasProfile.pdf 6
>> Printing FionnasProfile.pdf 7
>> Printing FionnasProfile.pdf 8
>> Printing FionnasProfile.pdf 9
>> Printing FionnasProfile.pdf 10
*/
