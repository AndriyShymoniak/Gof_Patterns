package behavioral.state;

public class Closed implements State {
    @Override
    public void open() {
        System.out.println("Opening the door");
    }

    @Override
    public void close() {
        System.out.println("Error. The door is closed already");
    }
}
