package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c='a';
        do {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            System.out.println("Sum="+(n1+n2));
            System.out.println("Do you want to continue:Y/N");
            c=sc.next().charAt(0);
        }while(c=='Y'||c=='y');
    }
}
