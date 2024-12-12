package JavaCollectionFramework;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args){
        //Implementation on top of binary search tree (Red black tree exact word), and it always prints in sorted form
        //You want use set but in sorted form, use Tree Set
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(22);
        treeSet1.add(13);
        treeSet1.add(42);
        treeSet1.add(25);
        treeSet1.add(6);

        System.out.println(treeSet1);
        treeSet1.add(24);
        System.out.println(treeSet1);
    }
}
