package creational.factorymethod.shop;

import creational.factorymethod.CoffeeType;
import creational.factorymethod.coffee.Coffee;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType coffeeType){
        Coffee coffee = createCoffee(coffeeType);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType coffeeType);
}
