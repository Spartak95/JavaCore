package net.example;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        OutputStreamWriter osw = null;
        InputStreamReader isr = null;
        for(int i=0; i<5;i++){
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 9879);
            //write to socket using ObjectOutputStream
            osw = new OutputStreamWriter(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            if(i==4) {
                osw.write("exit");
            } else {
                osw.write("" + i);
                osw.flush();
            }
            //read the server response message
            isr = new InputStreamReader(socket.getInputStream());
            int a = isr.read();
            String message = new String(String.valueOf(a));
            System.out.println("Message: " + message);
            //close resources
            isr.close();
            osw.close();
            Thread.sleep(100);
        }
    }
}
