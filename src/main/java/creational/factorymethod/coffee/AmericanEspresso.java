package creational.factorymethod.coffee;

public class AmericanEspresso extends Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Make Espresso American style");
    }
}
