package structural.facade;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Storage {
    private String goods;

    public void findOnStorage(){
        System.out.println("Searching for " + goods);
    }

    public void passGoodsToDelivery(){
        System.out.println("Passing " + goods + "to delivery company");
    }
}
