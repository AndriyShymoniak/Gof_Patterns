package creational.abstractfactory.toyfactory;

import creational.abstractfactory.bear.Bear;
import creational.abstractfactory.bear.TeddyBear;
import creational.abstractfactory.cat.Cat;
import creational.abstractfactory.cat.TeddyCat;

public class TeddyToyFactory implements ToyFactory{
    @Override
    public Bear getBear() {
        return new TeddyBear();
    }

    @Override
    public Cat getCat() {
        return new TeddyCat();
    }
}
