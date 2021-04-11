package behavioral.observer;

import behavioral.observer.users.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventManagerImpl implements EventManager {
    private List<Subscriber> subscribers;
    private List<String> goodsOnSale;

    public EventManagerImpl() {
        subscribers = new ArrayList<>();
        goodsOnSale = Stream.of("Shirt", "Jeans", "Jacket", "T-shirt", "Boots")
        .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void addObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(sub -> sub.handleEvent(goodsOnSale));
    }
}
