package collection.example;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println("ts բազմության պարունակությունը " + ts);
        TreeSet<String> ts2 = new TreeSet<String>();
        ts2 = (TreeSet<String>) ts.subSet("B", "F");
        System.out.println("ts2 բազմության պարունակությունը " + ts2);
        System.out.println("tailSet() " + ts.tailSet("C"));
        System.out.println("headSet() " + ts.headSet("E"));
        System.out.println("containsAll(ts2) " + ts.containsAll(ts2));
    }
}

