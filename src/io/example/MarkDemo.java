package io.example;

import java.io.FileInputStream;
import java.io.InputStream;

public class MarkDemo {
    public static void main(String[] args) throws Exception {
        InputStream is = null;

        try {
            is = new FileInputStream("D://test.txt");
            System.out.println("Char : "+(char)is.read());
            System.out.println("Char : "+(char)is.read());
            System.out.println("Char : "+(char)is.read());
            is.mark(0);
            System.out.println("Char : "+(char)is.read());
            System.out.println("Char : "+(char)is.read());
            if(is.markSupported()) {
                is.reset();
                System.out.println("Char : "+(char)is.read());
                System.out.println("Char : "+(char)is.read());
            }

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(is!=null)
                is.close();
        }
    }
}
