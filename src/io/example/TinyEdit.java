package io.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] srt = new String[100];
        System.out.println("Մուտքագրենք տեքստային տող");
        System.out.println("Մուտագրեք \"կանգ առ\" տողը, որպեսզի ծրագիրը ավարտվի");
        for (int i = 0; i<srt.length; i++){
           srt[i] = br.readLine();
           if (srt[i].equals("կանգ առ")){
               break;
           }
        }
        System.out.println("\nՁեր ֆայլի պարունակությունը");
        for (int i = 0; i<srt.length; i++){
            if (srt[i].equals("կանգ առ")){
                break;
            }
            System.out.println(srt[i]);
        }
    }
}

