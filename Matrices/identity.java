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
        int ctr=0;
        if(m!=n)
            System.out.println("Not identity!");
        else
        {
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            }
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if(arr[i][j]==arr[j][i])
                        continue;
                    else {
                        ctr = 1;
                        break;
                    }
                }
                if(ctr==1) {
                    System.out.println("Not identity!");
                    break;
                }
            }
            if(ctr==0)
                System.out.println("Identity!!!");
        }
    }
}
