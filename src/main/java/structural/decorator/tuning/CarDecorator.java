package structural.decorator.tuning;

import lombok.Getter;
import lombok.Setter;
import structural.decorator.car.Car;

@Getter
@Setter
public class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void installTuning() {
        car.installTuning();
    }
}
