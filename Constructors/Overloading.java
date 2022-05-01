package com.company;
import java.util.*;
class Xyz
{
    int num1;
    int num2;
    int result;
    public Xyz(int d)
    {
        num1=d;
        num2=d;
    }
    public Xyz(double d, int n)
    {
        num1=(int) d;
        num2=n;
    }
}

public class Main
{
    public static void main(String args[])
    {
        Xyz obj=new Xyz(9.5,10);
        System.out.println(obj.num1);
    }
}
