package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks scored in the subject:");
        int a=sc.nextInt();
        System.out.println((a>=80)?"A":(((a>=60) &&(a<80))?"B":"C"));
    }
}
