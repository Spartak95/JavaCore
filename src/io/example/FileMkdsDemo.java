package io.example;

import java.io.File;

public class FileMkdsDemo {
    public static void main(String[] args) {
        File fl = new File("D:/Program/Program_2");
        File fl2 = new File("D:/Program_3/Program_4");
        if (fl.mkdir()){
            System.out.println("Թղթապանակները ստեղծվել են");
        }else {
            System.out.println("Թղթապանակները չեն ստեղծվել");
        }
        if (fl2.mkdirs()){
            System.out.println("Թղթապանակները ստեղծվել են");
        }else {
            System.out.println("Թղթապանակները չեն ստեղծվել");
        }
    }
}

