package io.example;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
    public static void main(String[] args) {
        char[] b = new char[1024];
        char[] byteArray = {'H', 'e', 'l', 'l', 'o'};
        char[] byteArray2 = {' ','W', 'o', 'r', 'l', 'd'};
        try (CharArrayReader car = new CharArrayReader(byteArray);
             PushbackReader pr = new PushbackReader(car, 10)) {
             for (int i=0; i<byteArray.length; i++){
                 b[i] = (char) pr.read();
                 System.out.print(b[i]);
             }
             pr.unread(byteArray2);
             for (int i=0; i<byteArray2.length; i++){
                b[i] = (char) pr.read();
                System.out.print(b[i]);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

