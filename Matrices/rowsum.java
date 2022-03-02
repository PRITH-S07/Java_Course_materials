package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        int s=0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                s+=arr[i][j];
            System.out.println("Sum of row "+(i+1)+" is:"+s);
            s=0;
        }
    }
}
