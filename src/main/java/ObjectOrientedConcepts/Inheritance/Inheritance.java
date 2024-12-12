package ObjectOrientedConcepts.Inheritance;

import javax.swing.*;

class Shape {
    String color;
    public void area(){
        System.out.println("Printing Area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int side){
        System.out.println(0.4333*side*side);
    }
}

class Circle extends Shape{
    public void area(int radius){
        System.out.println(3.14*radius*radius);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "RED";
        t1.area(5,2); //Single level inheritance

        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.color = "GREEN";
        t2.area(4); //Multi level inheritance

        Circle c1 = new Circle();
        c1.color = "Blue";
        c1.area(3); // Circle and Square both are doing hierarchy inheritance multiple derived class


    }
}
