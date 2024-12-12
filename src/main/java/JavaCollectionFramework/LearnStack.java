package JavaCollectionFramework;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
