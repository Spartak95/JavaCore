package collection.example;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(23);
        pq.offer(6);
        pq.offer(56);
        pq.offer(45);
        pq.offer(32);
        System.out.print("pq հերթի պարունակությունը ");
        Iterator sd = pq.iterator();
        while (sd.hasNext()){
            System.out.print(sd.next() + " ");
        }
        System.out.println();
        System.out.print("pq հերթի պարունակությունը կանոնակարգված վիճակում");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + pq.poll());
        }

    }
}

