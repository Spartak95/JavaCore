package net.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.google.am");
        System.out.println(Address);
        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<sw.length; i++){
            System.out.println(sw[i]);
        }
    }
}

