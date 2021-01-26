package collection.example;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.add("A");
        ad.add("B");
        ad.add("C");
        ad.add("D");
        ad.add("E");
        ad.add("F");
        System.out.println("ad երկկողմանի հերթի պարունակությունը " + ad);
    }
}


