package io.example;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    File s;
    public static void main(String[] args) {
        String dirname = "D:/English Lessons";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt(".html");
        String[] s = fl.list(only);
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}

