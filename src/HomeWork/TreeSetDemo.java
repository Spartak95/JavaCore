package HomeWork;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(80);
        ts.add(120);
        System.out.println(ts);
        System.out.println(ts.ceiling(90));
        System.out.println(ts.floor(90));
        System.out.println(ts.descendingSet());
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.subSet(20, true, 50, true));
        System.out.println(ts.subSet(20, true, 50, false));
    }
}
