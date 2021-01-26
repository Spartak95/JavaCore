package collection.example;

import java.util.TreeSet;

public class CompDemo_2 {
    public static void main(String[] args) {
        MyComp_2 mc = new MyComp_2();
        TreeSet<String> ts = new TreeSet<>(mc.reversed());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        for (String element : ts){
            System.out.print(element + " ");
        }
    }
}

