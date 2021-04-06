package creational.abstractfactory.toyfactory;

import creational.abstractfactory.bear.Bear;
import creational.abstractfactory.bear.WoodenBear;
import creational.abstractfactory.cat.Cat;
import creational.abstractfactory.cat.WoodenCat;

public class WoodenToyFactory implements ToyFactory{
    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }
}
