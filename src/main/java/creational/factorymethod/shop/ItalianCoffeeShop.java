package creational.factorymethod.shop;

import creational.factorymethod.CoffeeType;
import creational.factorymethod.entity.*;

//Italian coffee factory
public class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case AMERICANO:
                coffee = new ItalianAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianEspresso();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianCaffeLatte();
                break;
        }
        return coffee;
    }
}
