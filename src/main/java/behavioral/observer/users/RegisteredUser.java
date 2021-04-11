package behavioral.observer.users;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RegisteredUser implements Subscriber {
    private String name;

    @Override
    public void handleEvent(List<String> goodsOnSale) {
        System.out.println("Dear " + name + " we have a special price for " +
                "this goods:" + goodsOnSale.toString());
    }
}
