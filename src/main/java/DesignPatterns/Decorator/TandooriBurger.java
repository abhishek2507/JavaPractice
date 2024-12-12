package DesignPatterns.Decorator;

public class TandooriBurger extends Burger {

    @Override
    public String getDescription() {
        return "Tandoori Burger";
    }

    @Override
    public double getCost() {
        return 120.0;
    }

}
