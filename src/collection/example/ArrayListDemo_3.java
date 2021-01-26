package collection.example;

import java.util.ArrayList;

public class ArrayListDemo_3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("C");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("C");
        al2.add("C");
        al2.add("E");
        System.out.println("al զանգվածի պարունակությունը " + al);
        System.out.println("al2 զանգվածի պարունակությունը " + al2);
        al.retainAll(al2);
        System.out.println("retainAll() մեթոդին կանչելուց հետո ");
        System.out.println("al զանգվածի պարունակությունը " + al);
        System.out.println("al2 զանգվածի պարունակությունը " + al2);
        System.out.println(al.indexOf("C"));
        System.out.println(al.lastIndexOf("C"));
        al.removeIf(n -> n == "C");
        System.out.println("removeIf() մեթոդին կանչելուց հետո ");
        System.out.println("al զանգվածի պարունակությունը " + al);
        System.out.println("removeIf() մեթոդին կանչելուց հետո ");
    }
}


