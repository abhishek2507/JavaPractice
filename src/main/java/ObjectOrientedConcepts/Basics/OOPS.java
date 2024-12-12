package ObjectOrientedConcepts.Basics;


class Pen {
    String color;
    String type;
    public void write() {
        System.out.println("writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student() {
        System.out.println("non param constructor called");
    }
    Student(String name, int age) {
        System.out.println("parameterised constructor called");
        this.name = name;
        this.age = age;
    }

    Student(Student stud) {
        System.out.println("Copy constructor called");
        this.name = stud.name;
        this.age = stud.age;
    }
}
public class OOPS {
    public static void main(String agrs[]){
        Pen pen1 = new Pen(); //This is a constructor [non-parameterised constructor] they allocate memory in heap
        pen1.color = "Green";
        pen1.type = "Ballpoint";

        pen1.write();
        pen1.printColor();

        Student stud1 = new Student();
        stud1.printInfo();

        Student stud2 = new Student("rahul",23);
        stud2.printInfo();

        Student stud3 = new Student(stud2);
        stud3.printInfo();
    }
}
