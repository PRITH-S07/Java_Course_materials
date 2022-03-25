package example;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class practice
{
    //example using ByteInputStream
    public static void main(String[] args) throws Exception
    {
        File f=new File("file01.txt");
        FileInputStream fis=new FileInputStream(f);
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f));
        bos.write(100);
        bos.close();
        BufferedInputStream br=new BufferedInputStream(fis);
        int data=br.read();
        System.out.println((char)data);
        fis.close();
        br.close();
    }
}

