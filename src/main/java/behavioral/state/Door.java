package behavioral.state;

import lombok.Setter;

@Setter
public class Door {
    private State state;

    public void open() {
        state.open();
        setState(new Opened());
    }

    public void close() {
        state.close();
        setState(new Closed());
    }
}
