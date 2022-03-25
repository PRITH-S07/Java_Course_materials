package example;
import java.io.*;
import java.util.*;
public class practice
{
    // merging 2 files using sequenceinputstream
    public static void main(String[] args) throws Exception
    {
        FileInputStream f1=new FileInputStream("txt1.txt");
        FileInputStream f2=new FileInputStream("txt2.txt");
        FileOutputStream fout=new FileOutputStream("foutput.txt");
        SequenceInputStream comb=new SequenceInputStream(f1,f2);
        int j;
        while((j=comb.read())!=-1)//read() function reaches -1 incase it reaches the end of the file
        {
            fout.write(j);//we use fout here as we have to write it into the output file
        }
        comb.close();//must close all the files
        f1.close();
        f2.close();
        fout.close();
    }
}

/* Sample output:
If doc1 says: "Hello world!"
doc2 says: "Good morning"
the output doc will read: "Hello World!Good morning"
