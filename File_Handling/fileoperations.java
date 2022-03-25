package example;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class practice
{
    //example using ByteInputStream
    public static void main(String[] args) throws Exception
    {
        File myObj=new File("file01.txt");
        if(myObj.createNewFile())
        {
            System.out.println("File created:"+myObj.getName());
            System.out.println("Absolute path:"+myObj.getAbsolutePath());
            System.out.println("Writeable:"+myObj.canWrite());
            System.out.println("Readable:"+myObj.canRead());
            System.out.println("File size in bytes:"+myObj.length());
            FileWriter fw=new FileWriter("file01.txt");
            fw.write("HEJ HYDERABAD, THIS IS IKEA!!!");
            fw.close();
            System.out.println("Successful write!");
            System.out.println("File size in bytes:"+myObj.length());
            File f=new File("file01.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                String data=sc.nextLine();
                System.out.println(data);
            }
            System.out.println("Successful read and write operation is complete!");
            sc.close();
        }
        else
        {
            System.out.println("File exists!");
        }
    }
}

/*Output is:
File created:file01.txt
Absolute path:C:\Users\reach\IdeaProjects\learnjavalanguage\file01.txt
Writeable:true
Readable:true
File size in bytes:0
Successful write!
File size in bytes:30
HEJ HYDERABAD, THIS IS IKEA!!!
Successful read and write operation is complete!
*/
