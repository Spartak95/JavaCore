package io.example;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fin = new FileReader("D:/text.txt");
        BufferedReader bin = new BufferedReader(fin);
        boolean b = bin.markSupported();
        if (b) {
            bin.mark(45);
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

