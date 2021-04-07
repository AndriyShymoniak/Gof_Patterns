package structural.decorator.tuning;


import structural.decorator.car.Car;

public class Wheels extends CarDecorator {

    public Wheels(Car car) {
        super(car);
    }

    @Override
    public void installTuning() {
        System.out.println("Better looking wheels installed");
        super.installTuning();
    }
}
