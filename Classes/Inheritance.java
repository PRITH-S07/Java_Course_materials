package com.company;
import java.util.*;
class Calc //Super
{
    public void add(int i,int j)
    {
        System.out.println(i+j);
    }
}
class AdvCalc extends Calc //Sub
{
    public void sub(int i,int j)
    {
        System.out.println(i-j);
    }
}
class AdvAdvCalc extends AdvCalc
{
    public void mul(int i,int j)
    {
        System.out.println(i*j);
    }
}
public class Main
{
    public static void main(String args[])
    {
        AdvAdvCalc obj=new AdvAdvCalc();
        obj.add(4,3);
        obj.sub(4,3);
        obj.mul(4,3);
    }
}
