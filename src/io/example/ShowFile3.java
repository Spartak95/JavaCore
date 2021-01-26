package io.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile3 {
    public static void main(String[] args) throws IOException{
        int a = 0;
        String st = "Բարի գալուստ";
        try(FileInputStream fin = new FileInputStream("D:\\1.txt");
            FileOutputStream fin2 = new FileOutputStream("D:\\2.txt")) {
            while (a != -1){
                a = fin.read();
                System.out.print((char)a);
            }
            fin2.write(st.getBytes());
        }
    }
}

