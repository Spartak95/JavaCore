package io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try(FileInputStream f = new FileInputStream("D:/test.txt")) {
            System.out.println("Հասանելի բայթերի ընդհանուր քանակը " + (size = f.available()));
            int n = size/25;
            System.out.println("Առաջին ընթերցված " + n + " բայթը test.txt ֆայլի միջից");
            for (int i = 0; i < n; i++) {
                System.out.print((char)f.read());
            }
            System.out.println("\nԴեռ հասանելի մնացած բայթերի ընդհանուր քանակը " + (size = f.available()));
            byte[] b = new byte[n];
            if (f.read(b) != n){
                System.err.println("Չի կարելի ընթերցել " + n + " բայթ");
            }
            System.out.println("Ընթերցված " + n + " բայթը test.txt ֆայլի միջից");
            System.out.println(new String(b, 0, n));
            System.out.println("Դեռ հասանելի մնացած բայթերի ընդհանուր քանակը " + (size = f.available()));
            f.skip(size/2);
            System.out.println("Մնացած բայթերի կեսին դեն ենք նետում " + (size = f.available()));
            System.out.println("Զանգվածի վերջում տեղադրված " + n/2 + " բայթերի ընթերցում");
            if (f.read(b, n/2, n/2) != n/2){
                System.err.println("Չի կարելի ընթերցել " + n/2 + " բայթ");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("Դեռ հասանելի մնացած բայթերի ընդհանուր քանակը " + (size = f.available()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

