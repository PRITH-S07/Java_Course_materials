package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt(),s=0;
        while(n>0)
        {
            s+=(n%10);
            n=n/10;
        }
        System.out.println("Sum of the digits is:"+s);
    }
}
