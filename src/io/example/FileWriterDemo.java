package io.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String str = "This is my first line\n"
                   + "This is my second line";
        try (FileWriter fw = new FileWriter("D:/text.txt")) {
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

