package creational.factorymethod.entity;

public class ItalianEspresso extends Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Make Espresso Italian style");
    }
}
