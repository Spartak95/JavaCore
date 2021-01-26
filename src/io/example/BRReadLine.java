package io.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Մուտքագրեք ցանկացած տեքստ");
        System.out.println("Ծրագրից դուրս գալու համար մուտքագրեք \"կանգ առ\" տողը");
        do{
          str = br.readLine();
        }while (!str.equals("կանգ առ"));
    }
}

