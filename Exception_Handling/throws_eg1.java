package example;

public class practice {
    static void arg()
    {
        try
        {
            throw new ArithmeticException("Demo");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught");
        }
    }
    public static void main(String[] args) {
        arg();
    }
}

//Output is: Exception caught
