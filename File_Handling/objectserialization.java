package example;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
class Save
{
    int i;
}
public class practice
{
    //example using ByteInputStream
    public static void main(String[] args) throws Exception
    {
        Save obj=new Save();
        obj.i=4;
        File f=new File("Obj.txt");

        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1=(Save) ois.readObject();
        System.out.println("Value of obj1:"+obj1.i);
    }
}
