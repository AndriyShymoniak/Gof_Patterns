package behavioral.state;

public class StateRunner {
    public static void main(String[] args) {
        Door door = new Door();
        door.setState(new Closed());
        door.close();
        door.open();
        door.open();
        door.close();
    }
}
