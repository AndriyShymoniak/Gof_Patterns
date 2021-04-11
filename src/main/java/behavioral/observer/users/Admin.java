package behavioral.observer.users;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Admin implements Subscriber {
    private String name;

    @Override
    public void handleEvent(List<String> goodsOnSale) {
        System.out.println("Dear " + name + " we have a special price for " +
                "this goods:" + goodsOnSale.toString() + "\nGet them on 15% " +
                "lower price!");
    }
}
