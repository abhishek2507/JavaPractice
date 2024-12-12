package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();

        //Add element to queue
        queue.offer("Doggy");
        queue.offer("Cat");
        queue.offer("Elephant");
        System.out.println(queue);

        //Remove element from queue
        queue.poll();
        System.out.println(queue);

        //Check which element is next ot be removed
        System.out.println(queue.peek());


        //Add remove elements are also there but we can use this in case we dont want error.
        queue.add("alpha");
        queue.remove();

    }
}
