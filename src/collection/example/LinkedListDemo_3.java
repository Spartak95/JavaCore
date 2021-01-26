package collection.example;

import java.util.LinkedList;

public class LinkedListDemo_3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        LinkedList<String> ll2 = new LinkedList<>();
        ll2 = (LinkedList<String>)ll.clone();
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        System.out.println("ll2 կապված ցուցակի պարունակությունը " + ll2);
        System.out.println("peek() -  " + ll.peek());
        System.out.println("peekFirst() - " + ll.peekFirst());
        System.out.println("peekLast() - " + ll.peekLast());
        System.out.println("pop() - " + ll.pop());
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        ll.push("A");
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        System.out.println("pollFirst() - " + ll.pollFirst());
        System.out.println("pollLast() - " + ll.pollLast());
        System.out.println("poll() - " + ll.poll());
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        System.out.println("ll2 կապված ցուցակի պարունակությունը " + ll2);
        ll.offer("B");
        ll.offerFirst("F");
        ll.offerLast("C");
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
        ll.removeFirstOccurrence("F");
        System.out.println("ll կապված ցուցակի պարունակությունը " + ll);
    }
}


