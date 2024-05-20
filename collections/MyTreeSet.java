package collections;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        
        Set<Integer> treeSet = new TreeSet<Integer>();
        
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(-1);

        System.out.println(treeSet);
   
   
    }
}
