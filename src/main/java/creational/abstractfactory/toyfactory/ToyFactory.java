package creational.abstractfactory.toyfactory;

import creational.abstractfactory.bear.Bear;
import creational.abstractfactory.cat.Cat;

public interface ToyFactory {
    Bear getBear();
    Cat getCat();
}
