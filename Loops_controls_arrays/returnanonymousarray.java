package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        int m[]=returnarray();
        for(int k:m)
        System.out.println(k);;
    }
    public static int[] returnarray()
    {
        return new int[] {2,3,4,5};
    }
}
