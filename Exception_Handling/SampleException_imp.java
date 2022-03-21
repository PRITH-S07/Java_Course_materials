package example;
import java.io.*;
import java.util.*;
class practice{
    static void validateInput(int number) throws InvalidInputException{
        if(number>100)
        {
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid Input");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number less than 100 : ");
        int number = sc.nextInt();
        try{
            validateInput(number);
        }
        catch(InvalidInputException e)
        {
            System.out.println("Caught exception - Input is greater than 100!");
        }
    }
}
class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}

/* Output: 
if number <100: Valid Input
else: Caught exception - Input is greater than 100!*/
