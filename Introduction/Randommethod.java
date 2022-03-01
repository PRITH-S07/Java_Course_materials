package example;
import java.util.*;
import java.lang.Math;
import java.util.Random;
public class Hello {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random(); // this object is created from the Random library in java.util
        System.out.println("Random +ve/-ve integer:"+rand.nextInt());
        System.out.println("Random +ve/-ve integer upto 500:"+rand.nextInt(500));
    }
}
