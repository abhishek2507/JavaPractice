package JavaCollectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDqueue {

    public static void main(String[] args){
        ArrayDeque<Integer> lo = new ArrayDeque<>();
        lo.offerFirst(1);
        lo.offerFirst(2);
        lo.offerLast(3);
        System.out.println(lo);

        lo.pollFirst();
        System.out.println(lo);

        lo.pollLast();
        System.out.println(lo);

    }
}
