package example;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
class practice{
    static void convertDateFormat(String inputDate){
        try
        {
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(inputDate);
            SimpleDateFormat outputsdf=new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outputsdf.format(date);
            System.out.println("After changing date format to yyyy/MM/dd : "+outputDate);
        }
        catch(java.text.ParseException e)
        {
            System.out.println("Some error occurred while converting date formats.");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date in dd/MM/yyyy format: ");
        String inputDate = sc.nextLine();
        convertDateFormat(inputDate);
    }
}


/* Output eg:
if date entered: 20-03-2022 => Some error occurred while converting date formats.
if date enteredL 20/03/2022 => After changing date format to yyyy/MM/dd : 2022/03/20 */
