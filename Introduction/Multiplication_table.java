package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("---Printing the table---");
        for(int i=1;i<=10;i++)
            System.out.println(n+"x"+i+"="+(n*i));
        System.out.println("Done!");
    }
}
