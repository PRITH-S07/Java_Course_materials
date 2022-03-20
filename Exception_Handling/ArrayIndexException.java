package example;

public class practice {
    public static void main(String[] args) {
        try {
            int arr[]=new int[5];
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception Detected!");
        }
    }
}
//Output: Array Index Exception Detected!
