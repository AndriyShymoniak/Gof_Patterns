package behavioral.observer;

import behavioral.observer.users.Subscriber;

public interface EventManager {
    void addObserver(Subscriber subscriber);

    void removeObserver(Subscriber subscriber);

    void notifyObservers();
}
