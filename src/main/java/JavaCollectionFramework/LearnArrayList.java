package JavaCollectionFramework;

import com.sun.jdi.IntegerType;
import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Adding element at particular Index: Time complexity O(n) for array is O(1) add/remove both
        list.add(1,100);
        System.out.println(list);


        List<Integer> list2 = new ArrayList<>();
        list2.add(17);
        list2.add(18);
        list2.add(20);

        //Adding whole list merged at particular Index
        list.addAll(2,list2);
        System.out.println(list);

        //Get element from the list
        System.out.println(list2.get(1));

        //Remove element from an index
        list2.remove(1);
        System.out.println(list2);

        //Remove element using element not index
        list2.remove(Integer.valueOf(20));
        list2.remove((Integer) 20);
        System.out.println(list2);

        //Remove complete list at once
        list2.clear();
        System.out.println(list2);

        //Update any value at position
        list.set(0,10000);
        System.out.println(list);

        //Contains element position
        System.out.println(list.contains(10000));

        //Index of element
        System.out.println(list.indexOf(100));

        //Iteration of list
        for(Integer element: list){
            System.out.println("yoyo" + element);
        }


    }
}
