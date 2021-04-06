package creational.factorymethod.shop;

import creational.factorymethod.CoffeeType;
import creational.factorymethod.coffee.*;

//American coffee factory
public class AmericanCoffeeShop extends CoffeeShop {
    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case AMERICANO:
                coffee = new AmericanAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanEspresso();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanCaffeLatte();
                break;
        }
        return coffee;
    }
}
