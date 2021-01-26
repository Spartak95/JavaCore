package HomeWork;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(26);
        pQueue.add(30);
        System.out.println(pQueue);
        System.out.println(pQueue.element());
        System.out.println(pQueue);
        ArrayDeque<Integer> pQueue2 = new ArrayDeque<>();
        pQueue2.offer(10);
        pQueue2.offer(20);
        pQueue2.offer(15);
        pQueue2.offer(26);
        pQueue2.offer(30);
        pQueue2.push(560);
        System.out.println(pQueue2);
        System.out.println(pQueue2.element());
        System.out.println(pQueue2);
    }

}
