package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        System.out.println("Elements entered:");
        for(int k:a)
            System.out.println(k);
    }
}
