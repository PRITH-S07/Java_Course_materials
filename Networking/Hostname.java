package example;
import java.net.*;
class practice{
    public static void main(String args[]) throws Exception
    {
        InetAddress IP= InetAddress.getLocalHost();
        System.out.println("The system's IP address is: "+IP.getHostAddress());
        System.out.println("The host name is: "+IP.getHostName());
    }
}

/* Output:
The system's IP address is: <your system's ip address>
The host name is: <your host name> */
