package example;

public class practice {
    public static void main(String[] args) {
        try {
            int a=10, b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Detected!");
        }
    }
}

//O/p: Arithmetic Exception Detected!......this is because of a divide by 0 error
