package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
