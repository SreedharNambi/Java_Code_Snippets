package collections;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(12);
        queue.offer(13);
        queue.offer(14);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }

}
