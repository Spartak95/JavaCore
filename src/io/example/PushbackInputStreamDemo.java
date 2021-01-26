package io.example;

import java.io.*;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        byte[] arrByte = new byte[1024];
        byte[] byteArray = {'H', 'e', 'l', 'l', 'o'};
        try(InputStream is = new ByteArrayInputStream(byteArray);
            PushbackInputStream pis = new PushbackInputStream(is, 10)) {
            for (int i = 0; i < byteArray.length; i++) {
                arrByte[i] = (byte) pis.read();
                System.out.print((char) arrByte[i]);
            }
            System.out.println();
            byte[] b = {'W', 'o', 'r', 'l', 'd'};
            pis.unread(b);
            for (int i = 0; i < byteArray.length; i++) {
                arrByte[i] = (byte) pis.read();
                System.out.print((char) arrByte[i]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


