package example;

public class practice {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception Detected!");
        }
    }
}

//O/p: Null Pointer Exception Detected!.....this is as str=null has been declared and str.charAt(0) won't work as it's null.
