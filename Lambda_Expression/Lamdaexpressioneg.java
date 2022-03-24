package example;
import java.io.*;
import java.util.*;
interface A
{
    void print(int i);
}
/*class xyz implements A
{
    void print(){
        System.out.println("hello");
    }
}*/
class practice
{
    public static void main(String[] args) {
        A obj;
        /*obj = new A() {
            public void print() {
                System.out.println("hello");
            }
        };*/
        // Advantage of lambda expression is that it eliminates the use of any anonymous inner class...
        obj = (int i) -> System.out.println("Hello "+i);
        obj.print(7);
    }
}

/* Output:
Hello 7*/
