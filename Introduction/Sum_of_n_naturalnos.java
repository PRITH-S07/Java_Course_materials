package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println(sum);
    }
}
