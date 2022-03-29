package example;
import java.net.*;
class practice{
    public static void main(String args[]) throws Exception
    {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP address of my system is: "+IP.getHostAddress());
    }
}

/* Output:
IP address of my system is: <your system's ip address> */
