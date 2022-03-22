package example;
import java.io.*;
import java.util.*;
// MyTask is a "thread"
class MyTask extends Thread{
    @Override
    public void run(){
        for(int doc=1;doc<=10;doc++){
            System.out.println("@@ Printing document #"+doc+" - Printer2");
        }
    }
}
public class practice
{
    // main method represents the main thread
    public static void main(String args[]) {
        // whatever we write in here will be executed by main thread
        // threads always execute the jobs in a sequence
        // Execution Context
        // Job 1
        System.out.println("===Application started===");
        // Job 2
        MyTask task = new MyTask(); // Child Thread / Worker Thread
        task.start(); // -> start shall internally execute run method
        // Till Job 2 is not finished, below written jobs are waiting and are not executed
        // In case Job 2 is a long running operation, i.e. several documents are supposed to be printed
        // In such a use case OS/JVM shall give a message that app is not responding
        // Some sluggish behavior in app can be observed -> App seems to hang
        // Now, main and MyTask are executing both parallelly or concurrently 
        // Job 4
        // Some code to print the documents
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("^^ Printing document #" + doc + " - Printer1");
        }
        //Job 4
        System.out.println("===Application finished===");
    }
}

/* Sample output:
===Application started===
^^ Printing document #1 - Printer1
^^ Printing document #2 - Printer1
@@ Printing document #1 - Printer2
^^ Printing document #3 - Printer1
^^ Printing document #4 - Printer1
@@ Printing document #2 - Printer2
^^ Printing document #5 - Printer1
@@ Printing document #3 - Printer2
@@ Printing document #4 - Printer2
^^ Printing document #6 - Printer1
@@ Printing document #5 - Printer2
@@ Printing document #6 - Printer2
@@ Printing document #7 - Printer2
@@ Printing document #8 - Printer2
@@ Printing document #9 - Printer2
@@ Printing document #10 - Printer2
^^ Printing document #7 - Printer1
^^ Printing document #8 - Printer1
^^ Printing document #9 - Printer1
^^ Printing document #10 - Printer1
===Application finished===
*/
