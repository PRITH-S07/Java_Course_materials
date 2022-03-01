package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter element to be searched for:");
        int n=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(a[i]==n) {
                System.out.println("Found");
                break;
            }
            else if(i==4)
                System.out.println("Not found");
        }
    }
}
