package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println("Matrix 1 details:");
        int arr1[][]=new int[m1][n1];
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n1; j++)
                arr1[i][j] = sc.nextInt();
        }
        System.out.println("Matrix 2 details:");
        int arr2[][]=new int[m1][n1];
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n1; j++)
                arr2[i][j] = sc.nextInt();
        }
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n1; j++)
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            System.out.println();
        }
    }
}
