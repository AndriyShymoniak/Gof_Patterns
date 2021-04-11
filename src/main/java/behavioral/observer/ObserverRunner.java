package behavioral.observer;

import behavioral.observer.users.Admin;
import behavioral.observer.users.RegisteredUser;
import behavioral.observer.users.UnregisteredUser;
import behavioral.observer.users.VipUser;

public class ObserverRunner {
    public static void main(String[] args) {
        EventManager eventManager = new EventManagerImpl();
        eventManager.addObserver(new UnregisteredUser());
        eventManager.addObserver(new RegisteredUser("Vasyl Stepanovych"));
        eventManager.addObserver(new Admin("Ivan Bubka"));
        eventManager.addObserver(new VipUser("pan Viktor Grygorovych"));
        eventManager.notifyObservers();
    }
}
