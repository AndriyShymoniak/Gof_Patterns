package behavioral.state;

public class Opened implements State {

    @Override
    public void open() {
        System.out.println("Error. The door is opened already");
    }

    @Override
    public void close() {
        System.out.println("Closing the door");
    }
}
