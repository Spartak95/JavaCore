package io.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good man\n " +
                        "to come to the aid of their country\n " +
                        "and pay their due texas";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try{
            f0 = new FileOutputStream("D:/file1.txt");
            f1 = new FileOutputStream("D:/file2.txt");
            f2 = new FileOutputStream("D:/file3.txt");
            for (int i=0; i<buf.length; i+=2){
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("Տեղի է ունեցել մուտքային և ելքային սխալ");
        }
        finally {
            try{
                if (f0 != null) f0.close();
            }
            catch(IOException e){
                System.out.println("file1.txt ֆայլին փակելուց առաջացած սխալ");
            }
            try{
                if (f1 != null) f1.close();
            }
            catch(IOException e){
                System.out.println("file2.txt ֆայլին փակելուց առաջացած սխալ");
            }
            try{
                if (f2 != null) f2.close();
            }
            catch(IOException e){
                System.out.println("file3.txt ֆայլին փակելուց առաջացած սխալ");
            }
        }
    }
}


