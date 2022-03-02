package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int t=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
