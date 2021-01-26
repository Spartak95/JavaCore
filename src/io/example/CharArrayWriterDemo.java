package io.example;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Այս տվյալները պետք է գրանցվեն զանգվածի մեջ";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f.toString());
    }
}

