package example;
import java.io.*;
import java.util.*;
class CA{

}
//class MyTask extends CA,Thread{ -> Error, as multiple inheritance is not supported in Java
class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int doc=1;doc<=10;doc++){
            System.out.println("@@ Printing document #"+doc+" - Printer2");
        }
    }
}
public class practice
{
    public static void main(String args[]) {
        System.out.println("===Application started===");
        //MyTask task = new MyTask();
        Runnable r=new MyTask();
        Thread task=new Thread(r);
        task.start();
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("^^ Printing document #" + doc + " - Printer1");
        }
        System.out.println("===Application finished===");
    }
}


/*Sample output:
===Application started===
^^ Printing document #1 - Printer1
^^ Printing document #2 - Printer1
^^ Printing document #3 - Printer1
^^ Printing document #4 - Printer1
^^ Printing document #5 - Printer1
^^ Printing document #6 - Printer1
^^ Printing document #7 - Printer1
^^ Printing document #8 - Printer1
^^ Printing document #9 - Printer1
@@ Printing document #1 - Printer2
@@ Printing document #2 - Printer2
@@ Printing document #3 - Printer2
@@ Printing document #4 - Printer2
@@ Printing document #5 - Printer2
@@ Printing document #6 - Printer2
@@ Printing document #7 - Printer2
@@ Printing document #8 - Printer2
@@ Printing document #9 - Printer2
@@ Printing document #10 - Printer2
^^ Printing document #10 - Printer1
===Application finished===
*/
