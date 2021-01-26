package io.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Մուտքագրենք սիմվոլներ, իսկ ծրագրից" +
                "\nդուրս գալու համար սեղմեք \'q\' ստեղնը ");
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');
    }
}

