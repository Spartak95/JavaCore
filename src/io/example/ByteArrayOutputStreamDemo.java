package io.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Այս տվյալները պետք է գրանցվեն զանգվածի մեջ";
        byte[] buf = s.getBytes();
        try{
            f.write(buf);
        }catch (IOException e){
            System.out.println("Բուֆերում տվյալներ գրանցելուց առաջացած սխալ");
            return;
        }
        System.out.println("Բուֆերը սիմվոլային տողի տեսքով");
        System.out.println(f);
    }
}



