package io.example;

import java.io.*;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream("D:/test.txt");
            InputStream is = new FileInputStream("D:/test.txt");
            os.write('A');
            os.flush();
            os.write('B');
            System.out.println("" + (char) is.read());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

