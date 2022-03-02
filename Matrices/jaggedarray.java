package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        int m[][]={{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }
}
