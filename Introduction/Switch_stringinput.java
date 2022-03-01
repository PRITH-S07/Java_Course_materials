package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        switch(a)
        {
            case "Steve":System.out.println("Steve");
            break;
            case "Jake":System.out.println("Jake");
            break;
            default:System.out.println("Invalid");
            break;
        }
    }
}
