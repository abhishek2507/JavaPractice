package JavaCollectionFramework;
import java.util.*;
public class LinkedListPlayground {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list"); //default add is addLast
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("null");
    }

}
