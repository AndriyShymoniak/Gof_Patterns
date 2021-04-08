package structural.facade;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Delivery {
    private String goods;

    public void packGoods(){
        System.out.println("Packing " + goods);
    }

    public void deliverGoods(){
        System.out.println("Delivering " + goods);
    }

    public void handGoods(){
        System.out.println("Giving " + goods + " to the client");
    }
}
