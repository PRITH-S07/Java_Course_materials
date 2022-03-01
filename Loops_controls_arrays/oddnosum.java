package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0,ct=0;
        while(ct<5)
        {
            System.out.println("Enter a non even number:");
            int n=sc.nextInt();
            if(n%2==0)
                continue;
            else {
                ct += 1;
                s+=n;
            }
        }
        System.out.println("Sum:"+s);
    }
}
