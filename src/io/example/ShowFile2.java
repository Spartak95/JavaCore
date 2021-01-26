package io.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        FileOutputStream fil = null;
        String st = "Բարի գալուստ";
        String st1 = " Java աշխարհ";
        try {
            fil = new FileOutputStream("d:\\2.txt");
            fil.write(st.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

