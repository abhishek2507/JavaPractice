package DesignPatterns.Decorator;

public class KFCKiosk {

    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        burger = new ExtraCheeseBurger(burger);
        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription() + " costs " +burger.getCost());


        Burger burger2 = new TandooriBurger();
        burger2 = new ExtraMayoBurger(burger2);
        System.out.println(burger2.getDescription() + " costs " +burger2.getCost());
    }
}
