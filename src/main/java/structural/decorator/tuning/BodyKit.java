package structural.decorator.tuning;

import structural.decorator.car.Car;

public class BodyKit extends CarDecorator {

    public BodyKit(Car car) {
        super(car);
    }

    @Override
    public void installTuning() {
        System.out.println("Body kit installed");
        super.installTuning();
    }
}
