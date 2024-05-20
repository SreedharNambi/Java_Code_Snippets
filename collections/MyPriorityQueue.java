package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(40);
        queue.offer(20);
        queue.offer(300);
        queue.offer(10);
        queue.offer(440);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
