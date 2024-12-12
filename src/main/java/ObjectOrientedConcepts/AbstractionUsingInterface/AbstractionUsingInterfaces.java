package ObjectOrientedConcepts.AbstractionUsingInterface;

interface Animal{
    void walk(); //Only abstract methods and variables can be added here [Un-implemented]
}
interface Herbivore{
    //Multiple inheritance is supported using interfaces
}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class AbstractionUsingInterfaces {
    public static void main(String args[]){
        Horse badal = new Horse();
        badal.walk(); //Single constructor will be called of derived class
    }
}
