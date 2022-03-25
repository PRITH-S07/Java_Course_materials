package example;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class practice
{
    //example using ByteInputStream
    public static void main(String[] args) throws Exception
    {
        String message="This is a test of byte array stream";
        byte[] source=message.getBytes();
        ByteArrayInputStream bais=new ByteArrayInputStream(source);
        int c=0;
        while((c=bais.read())!=-1)
        {
            System.out.print((char)c);
        }
        bais.reset();//so that bais points to the 1st character in the string, not the last
        byte[] b=new byte[100];
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(source);
        System.out.println("\nOutput stream: "+baos.toString());
        FileOutputStream fos=new FileOutputStream("file2.txt");
        baos.writeTo(fos);
    }
}

/*Output:
This is a test of byte array stream
Output stream: This is a test of byte array stream

In the file2.txt file, it writes "This is a test of byte array stream" into the file.*/
