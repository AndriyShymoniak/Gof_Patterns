package creational.factorymethod;

import creational.factorymethod.shop.AmericanCoffeeShop;
import creational.factorymethod.shop.CoffeeShop;
import creational.factorymethod.shop.ItalianCoffeeShop;

public class FMRunner {
    public static void main(String[] args) {
        CoffeeShop italian = new ItalianCoffeeShop();
        italian.orderCoffee(CoffeeType.AMERICANO);

        CoffeeShop american = new AmericanCoffeeShop();
        american.orderCoffee(CoffeeType.ESPRESSO);
    }
}
