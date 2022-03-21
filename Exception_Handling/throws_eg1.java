package example;

public class practice {
    static void arg() throws ArithmeticException
    {
        System.out.println("Inside arg function");
        throw new ArithmeticException("Demo");
    }
    public static void main(String[] args) {
        try{
            arg();
        }
        finally
        {
            System.out.println("Caught");
        }
    }
}

/* Output is:
Inside arg function
Caught
Exception in thread "main" java.lang.ArithmeticException: Demo
	at example.practice.arg(practice.java:7)
	at example.practice.main(practice.java:11) */
