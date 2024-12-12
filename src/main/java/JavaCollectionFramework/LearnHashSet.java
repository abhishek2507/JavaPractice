package JavaCollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void  main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(7);
        set1.add(54);

        System.out.println(set1);

        set1.remove(4);

        System.out.println(set1);
        System.out.println(set1.contains(7));
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.clear();
        System.out.println(set1);
    }

}
