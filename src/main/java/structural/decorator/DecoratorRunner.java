package structural.decorator;

import structural.decorator.car.Car;
import structural.decorator.car.Honda;
import structural.decorator.tuning.*;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car car = new Exhaust(new Spoiler(new Wheels(new BodyKit(new Honda()))));
        car.installTuning();
    }
}
