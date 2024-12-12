package JavaCollectionFramework;

import java.util.*;

public class LearnMap {
    public static void main(String[] args){
        //HashMap<String, Integer> numbers = new HashMap<>();
        //The tree map will maintain order
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Three",3);
        numbers.put("Two",2);
        numbers.put("Four",4);
        numbers.put("Twenty",20);
        numbers.put("Ten",10);
        numbers.put("Thirteen",13);
//
//        if(!numbers.containsKey("Two")){
//            numbers.put("Two",23);
//        }

        //Equivalent code:
        numbers.putIfAbsent("Two",23);
        System.out.println(numbers.get("Lol"));

        //Very Important to remember
        for(Map.Entry<String,Integer> x: numbers.entrySet()){
            System.out.println(x.getKey());
            System.out.println(x.getValue());
            System.out.println(x);
        }

        System.out.println(numbers.containsKey("Two"));
        System.out.println(numbers.containsValue(2));
    }

}
