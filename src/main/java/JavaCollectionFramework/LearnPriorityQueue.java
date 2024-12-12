package JavaCollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args){
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.offer(32);
        pqueue.offer(64);
        pqueue.offer(22);
        pqueue.offer(45);
        pqueue.offer(36);

        System.out.println(pqueue);

        //Min heap has smallest element at first place and pops it first
        pqueue.poll();
        System.out.println(pqueue);

    }
}
