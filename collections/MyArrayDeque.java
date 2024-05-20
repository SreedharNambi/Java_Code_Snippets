package collections;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> myArray = new ArrayDeque<Integer>();
        myArray.offer(1);
        myArray.offerFirst(2);
        myArray.offerLast(4);
        myArray.offer(3);

        System.out.println(myArray);
    }
}
