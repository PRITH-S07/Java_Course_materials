package example;
import java.io.*;
import java.util.*;
public class practice
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("demo.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);// belongs to java.io
        // in order to create DataOutputStream object, we must use FileOutputStream
        dos.writeUTF("demo text");
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        System.out.println(str);
    }
}

// Output: demo text
