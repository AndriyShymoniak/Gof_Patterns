package behavioral.observer.users;

import java.util.List;

public class UnregisteredUser implements Subscriber {
    @Override
    public void handleEvent(List<String> goodsOnSale) {
        System.out.println("Dear customer, we have sales on this goods:"
        + goodsOnSale.toString());
    }
}
