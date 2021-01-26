package collection.example;

import java.util.TreeSet;

public class CompDemo_3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((a, b) -> a.compareTo(b));
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

