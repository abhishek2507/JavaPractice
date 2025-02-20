package DesignPatterns.Decorator;

public class ExtraMayoBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraMayoBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription(){
        return burger.getDescription() + " with extra mayo";
    }

    @Override
    public double getCost(){
        return burger.getCost() + 30.0;
    }
}
