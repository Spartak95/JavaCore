package net.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo {
    private static ServerSocket server;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       server = new ServerSocket(8000);
       int count = 0;
           //System.out.println("Սպասում ենք հաճախորդի հարցմանը");
           Socket client = server.accept();
           //System.out.println("Ընդունած հաճախորդները " + (count++));
           //InputStreamReader ois = new InputStreamReader(client.getInputStream());
           //String message = String.valueOf(ois.read());
           //System.out.println("Message Received: " + message);
           OutputStreamWriter oos = new OutputStreamWriter(client.getOutputStream());
           oos.write("HTTP/1.0 2000 OK\n<h1>Java</h1>");
           oos.flush();
           //ois.close();
           oos.close();
           client.close();
           server.close();
    }
}
