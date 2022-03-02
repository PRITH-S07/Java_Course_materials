package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        int m[]={2,3,4};
        changearray(m);
        for(int k:m)
        System.out.println(k);
    }
    public static void changearray(int m[])
    {
        m[1]=999;
    }
}
// Output is:
/* 2
999
4
 */
