package ObjectOrientedConcepts.Polymorphism;

class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}
public class Polymorphism {
    public static void  main(String args[]){
        Student stud1 = new Student();
        stud1.age = 25;
        stud1.name = "manish";

        stud1.printInfo(stud1.age);
        stud1.printInfo(stud1.name);
        stud1.printInfo(stud1.name,stud1.age);

    }
}
