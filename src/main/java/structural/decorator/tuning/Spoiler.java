package structural.decorator.tuning;

import structural.decorator.car.Car;

public class Spoiler extends CarDecorator {

    public Spoiler(Car car) {
        super(car);
    }

    @Override
    public void installTuning() {
        System.out.println("Spoiler installed");
        super.installTuning();
    }
}
