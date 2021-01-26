package io.example;

import java.io.File;

public class FileDemo {
    public static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File fl = new File("D://text.txt");
        p("Ֆայլի անունը " + fl.getName());
        p("Բացարձակ ուղին " + fl.getAbsolutePath());
        p("Ծնողական կատալոգը " + fl.getParent());
        p(fl.exists() ? "գոյություն ունի" : "գոյություն չունի");
        p(fl.canWrite() ? "հասանելի է գրանցման համար" : "հասանելի չէ գրանցման համար");
        p(fl.canRead() ? "հասանելի է ընթերցելու համար" : "հասանելի չէ ընթերցելու համար");
        p(fl.isDirectory() ? "հանդիսանում է կատալոգ" : "չի հանդիսանում է կատալոգ");
        p(fl.isFile() ? "հանդիսանում է սովորական ֆայլ" : "չի հանդիսանում ֆայլ");
        p(fl.isAbsolute() ? "հանդիսանում է բացարձակ" : "չի հանդիսանում բացարձակ");
        p("Վերջին փոփոխությունները ֆայլում " + fl.lastModified());
        p("Չափը " + fl.length() + " բայթ");
    }
}

