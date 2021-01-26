package io.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferedInputStreamDemo_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("D:/text.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        System.out.println("Հասանելի բայթերի քանակը " +
                                        bin.available());
        boolean b = bin.markSupported();
        if (b) {
            bin.mark(bin.available());
        }
        bin.skip(8);
        System.out.println("text ֆայլի պարունակությունը");
        int ch;
        while ((ch=bin.read()) != -1) {
            System.out.print((char) ch);
        }
        bin.reset();
        System.out.println();
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);
        fin.close();
    }
}

