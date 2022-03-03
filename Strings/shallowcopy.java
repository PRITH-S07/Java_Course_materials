package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        int[][] a={{1,1},{2,2}};
        int[][] b=a.clone();
        a[0][0]++;
        for(int k[]:b)
            for(int j:k)
                System.out.println(j);
        // shallow copy
    }
}
