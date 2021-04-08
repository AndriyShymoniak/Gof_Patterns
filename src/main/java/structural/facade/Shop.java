package structural.facade;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Shop {
    private String goodsToOrder;

    public void consultClient() {
        System.out.println("Consulting client on " + goodsToOrder);
    }

    public void checkAvailability() {
        System.out.println("Checking for " + goodsToOrder + " availability ");
    }

    public void checkPrice() {
        System.out.println("Checking price of " + goodsToOrder);
    }

    public void acceptOrder() {
        System.out.println("Accepting the order");
    }
}
