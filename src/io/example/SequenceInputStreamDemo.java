package io.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
         int c;
         Vector<String> files = new Vector<String>();
         files.addElement("D:/file1.txt");
         files.addElement("D:/file2.txt");
         files.addElement("D:/file3.txt");
         InputStreamEnumerator ise = new InputStreamEnumerator(files);
         InputStream input = new SequenceInputStream(ise);
         try {
             while((c = input.read()) != -1){
                 System.out.print((char) c);
             }
         }catch (NullPointerException e){
             e.printStackTrace();
         }catch (IOException e){
             e.printStackTrace();
         }finally {
             try {
                 input.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
    }
}

