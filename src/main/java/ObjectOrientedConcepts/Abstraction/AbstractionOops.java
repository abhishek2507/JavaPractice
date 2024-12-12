package ObjectOrientedConcepts.Abstraction;

abstract class Animal{
    //It's an abstract Idea but we don't create objects out of it directly
    abstract void walk();
    //Implementation of this function is not required because its abstract class
    //And we need to implement them in the derived class permanently
    Animal(){
        System.out.println("You are creating a new Animal");
    }

}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("Created a horse");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class AbstractionOops {
    public static void main(String args[]){
        Horse badal = new Horse(); //Constructor chaining first base constructor is called then derived.
        badal.walk();
    }
}
