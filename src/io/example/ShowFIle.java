package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFIle {
    public static void main(String[] args) {
        int a = 0;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\1.txt");
            // մցնում ենք ցիկլի մեջ, որպեսզի տեքստը
            // ամբողջությամբ կարդացվի, քանի որ read()
            // մեթոդը վերադարձնում են մեկ սիմվոլ
            while (a != -1){
                a = fin.read();
                // int տիպը վերափոխում ենք char սիմվոլային տիպի
                System.out.print((char)a);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // ֆայլի հետ աշխատանք ավարտելուց փակում ենք
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


