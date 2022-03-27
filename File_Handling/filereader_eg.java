package example;
import java.io.*;
public class practice
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("file1.txt");
        FileReader fr=new FileReader(f);
        char c[]=new char[10];
        fr.read(c);
        for(char k:c)
            System.out.print(k);
    }
}
