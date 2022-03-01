package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double n3=sc.nextDouble();
        System.out.println("Min is:"+Math.min(n1,n2));
        System.out.println("Max is:"+Math.max(n1,n2));
        System.out.println("n1 to the power of n2 is:"+Math.pow(n1,n2));
        System.out.println("Sqrt of n1:"+Math.sqrt(n1));
        System.out.println("Floor of n3:"+Math.floor(n3));
        System.out.println("Ceil of n3:"+Math.ceil(n3));
        System.out.println("Round of n3 is:"+Math.round(n3));
        System.out.println("Round of n3 up unto the 2nd decimal place is:"+(Math.round(n3*100.0)/100.0));
        System.out.println("Random double value between 0.0 and 1.0:"+Math.random());
    }
}
