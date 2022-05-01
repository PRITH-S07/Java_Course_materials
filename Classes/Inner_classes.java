package com.company;
import java.util.*;
class Outer
{
    int a;
    public void display()
    {
        System.out.println("yo");
    }
    class Inner
    {
        public void show()
        {
            System.out.println("Hey!");
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        Outer obj=new Outer();
        obj.display();
        Outer.Inner obj1=obj.new Inner();
        obj1.show();
    }
}

/*Output:
yo
Hey! */
