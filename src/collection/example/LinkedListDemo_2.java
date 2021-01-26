package collection.example;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        Collection<String> collect = new LinkedList<String>();
        collect.add("A");
        collect.add("F");
        collect.add("B");
        collect.add("D");
        collect.add("E");
        collect.add("C");
        collect.add("A");
        ll.addAll(collect);
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        ll.addAll(2, collect);
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        System.out.println("contains(\"A\") - " + ll.contains("A"));
        System.out.println("getFirst() - " + ll.getFirst());
        System.out.println("getLast() - " + ll.getLast());
        System.out.println("indexOf(\"C\") - " + ll.indexOf("C"));
        System.out.println("lastIndexOf(\"A\") - " + ll.lastIndexOf("A"));
        System.out.println("size() - " + ll.size());
        ll.clear();
        System.out.println("isEmpty() - " + ll.isEmpty());
    }
}

