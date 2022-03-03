package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        int[] a={1,2,3,4,5};
        int[] b=a.clone();
        a[0]++;
        for(int k:b)
            System.out.println(k);
        System.out.println("-----");
        for(int k:a)
            System.out.println(k);
    }
}
