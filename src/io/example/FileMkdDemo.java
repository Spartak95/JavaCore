package io.example;

import java.io.File;

public class FileMkdDemo {
    public static void main(String[] args) {
        File fl = new File("D:/Program");
        if (fl.mkdir()){
            System.out.println("Program անունով թղթապանակը ստեղծվել է");
        }else {
            System.out.println("Program անունով թղթապանակը " +
                    "արդեն գոյություն ունի");
        }
        File fl2 = new File("D:/Music");
        if (fl2.mkdir()){
            System.out.println("Music անունով թղթապանակը ստեղծվել է");
        }else {
            System.out.println("Music անունով թղթապանակը " +
                    "արդեն գոյություն ունի");
        }
    }
}

