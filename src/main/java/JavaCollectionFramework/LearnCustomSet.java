package JavaCollectionFramework;

import java.util.HashSet;

public class LearnCustomSet {
    public static void main(String[] args){
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("abhi",32));
        students.add(new Student("animesh",22));
        students.add(new Student("animal",23));
        System.out.println(students);
    }
}
