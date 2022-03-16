package example;

public class practice {
    public static void main(String args[])
    {
        A a=new A();
        a.method(Integer.parseInt("12"));
    }
}
class A
{
    void method(int a)
    {
        System.out.println(a);
    }
}

// O/p: 12, however, when "12" in Integer.parseInt() is replaced by "xy", we get a numberformatexception error.
