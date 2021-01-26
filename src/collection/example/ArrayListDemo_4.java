package collection.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo_4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("C");
        al2.add("A");
        al2.add("E");
        System.out.println("al զանգվածի պարունակությունը " + al);
        System.out.println("al2 զանգվածի պարունակությունը " + al2);
        al.removeAll(al2);
        System.out.println("removeAll() մեթոդին կանչելուց հետո ");
        System.out.println("al զանգվածի պարունակությունը " + al);
        List<String> al3 = al.subList(1, 2);
        System.out.println("subList() մեթոդին կանչելուց հետո " + al3);
    }
}

