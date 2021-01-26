package collection.example;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add(null);
        ll.addLast("Z");
        ll.addLast("A");
        ll.add(1, "A2");
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        ll.remove("F");
        ll.remove(2);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll կապված ցուցակի պարունակությունը " +
                "էլեմենտներին ջնջելուց հետո " + ll);
        System.out.println("get(2) - " + ll.get(2));
        ll.set(0, "A");
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
    }
}

