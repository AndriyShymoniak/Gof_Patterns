package structural.decorator.car;


public class Honda implements Car {

    @Override
    public void installTuning() {
        System.out.println("Honda drives fast");
    }
}
