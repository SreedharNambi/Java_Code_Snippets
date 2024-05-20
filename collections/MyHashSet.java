package collections;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();                                                                                                                                                          
        set.add(1);
        set.add(2);

        System.out.println(set);

        // set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(2));
   
   
    }
}
