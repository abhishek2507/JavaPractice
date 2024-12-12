package JavaCollectionFramework;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(12);
        list.add(32);
        list.add(2);
        list.add(42);
        list.add(23);


        //Collections.sort(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        //Custom Class Student to be sorted
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("abhi",32));
        students.add(new Student("animesh",22));
        students.add(new Student("animal",23));
        Collections.sort(students,Comparator.comparing(x->x.rollNo));
        System.out.println(students);
    }
}
