package creational.abstractfactory;

import creational.abstractfactory.bear.Bear;
import creational.abstractfactory.cat.Cat;
import creational.abstractfactory.toyfactory.TeddyToyFactory;
import creational.abstractfactory.toyfactory.ToyFactory;
import creational.abstractfactory.toyfactory.WoodenToyFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        ToyFactory teddyToyFactory = new TeddyToyFactory();
        Bear teddyBear = teddyToyFactory.getBear();
        Cat teddyCat = teddyToyFactory.getCat();
        teddyBear.roar();
        teddyCat.meow();

        ToyFactory woodenToyFactory = new WoodenToyFactory();
        Bear woodenBear = woodenToyFactory.getBear();
        Cat woodenCat = woodenToyFactory.getCat();
        woodenBear.roar();
        woodenCat.meow();
    }
}
