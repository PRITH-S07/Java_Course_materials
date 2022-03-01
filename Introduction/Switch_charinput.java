package example;
import java.util.*;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char a=sc.next().charAt(0);
        switch(a)
        {
            case 'a':System.out.println("a");
            break;
            case 'b':System.out.println("b");
            break;
            default:System.out.println("Invalid");
            break;
        }
    }
}
