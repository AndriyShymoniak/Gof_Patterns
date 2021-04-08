package structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacadeImpl();
        orderFacade.makeOrder("Headphones");
        System.out.println("====================");
        orderFacade.makeOrder("Boots");
    }
}
