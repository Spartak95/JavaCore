package collection.example;

import java.util.ArrayList;

public class ArrayListDemo_5 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(9);
        al.add("C");
        al.add("C");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.trimToSize();
        al.ensureCapacity(100);
    }
}

