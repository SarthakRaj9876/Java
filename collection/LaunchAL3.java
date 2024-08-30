package collection;

import java.util.PriorityQueue;             // uses min heap to store element,not store string

public class LaunchAL3{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(600);
        pq.add(100);
        pq.add(900);

        System.out.println(pq);

        pq.add(400);

        System.out.println(pq);






    }
}

