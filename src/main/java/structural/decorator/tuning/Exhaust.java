package structural.decorator.tuning;

import structural.decorator.car.Car;

public class Exhaust extends CarDecorator {

    public Exhaust(Car car) {
        super(car);
    }

    @Override
    public void installTuning() {
        System.out.println("Exhaust installed");
        super.installTuning();
    }
}
