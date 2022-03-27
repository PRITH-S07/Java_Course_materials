package example;
import java.io.*;
public class practice
{
    //demo for serialization and de-serialization
    //this is useful in case of distributed systems in which 2 objects on a network need to communicate with each other and need to pass objects to one another
    public static void main(String[] args) throws IOException
    {
        try {
            student s = new student("ABC", "19BCE");
            File obj = new File("ABC.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(obj));
            oos.writeObject(s);
            //writing the object to the file implies that we have serialized the object
            //we can deserialize the object by reading the object back from the file
            oos.close();//this is imp
            ObjectInputStream objin = new ObjectInputStream(new FileInputStream(obj));
            student instudent = null;
            instudent = (student) objin.readObject();
            System.out.println(instudent.name + " " + instudent.regno);
            objin.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
//serialization of the object - write the object to a file
class student implements Serializable // very very imp to say that it "implements Serializable"
{
    String name;
    String regno;
    public student(String name,String regno)
    {
        super();
        this.name=name;
        this.regno=regno;
    }
}

// Output: ABC 19BCE
