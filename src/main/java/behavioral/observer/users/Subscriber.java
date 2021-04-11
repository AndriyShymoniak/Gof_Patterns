package behavioral.observer.users;

import java.util.List;

public interface Subscriber {
    void handleEvent(List<String> goodsOnSale);
}
