package example;
import java.util.*;
import java.lang.Math;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username:");
        String user=sc.nextLine();
        System.out.println("Enter password:");
        String pass=sc.nextLine();
        System.out.println("Confirm password:");
        String conf=sc.nextLine();
        if(!conf.equals(pass))
            System.out.println("Password error!");
        else
        {
            if(user=="")
                System.out.println("Username is empty");
            if(pass=="")
                System.out.println("Password is empty");
            if(pass.length()<8)
                System.out.println("Password is not a min. of 8 characters in length");
            if(pass.contains(user))
                System.out.println("Password contains username");
            System.out.println("Password matches!!!");
        }
    }
}
