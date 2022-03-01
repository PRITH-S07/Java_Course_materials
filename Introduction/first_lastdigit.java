package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt(),f=n;
        System.out.println("Last digit is:"+(n%10));
        while(n>0)
        {
            f=n;
            n=n/10;
        }
        System.out.println("First digit is:"+f);
    }
}
