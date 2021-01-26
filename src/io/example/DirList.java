package io.example;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "D:/Music";
        File fl = new File(dirname);
        if (fl.isDirectory()){
            System.out.println("Կատալոգը " + dirname);
            String[] s = fl.list();
            for (int i=0; i<s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " հանդիսանում է կատալոգ");
                }else {
                    System.out.println(s[i] + " չի հանդիսանում է կատալոգ");
                }
            }
        }else {
            System.out.println(dirname + "չի հանդիսանում է կատալոգ");
        }
    }
}

