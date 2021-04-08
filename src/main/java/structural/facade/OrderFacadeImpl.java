package structural.facade;

public class OrderFacadeImpl implements OrderFacade {

    private Delivery delivery;
    private Shop shop;
    private Storage storage;

    public OrderFacadeImpl() {
        delivery = new Delivery();
        shop = new Shop();
        storage = new Storage();
    }

    @Override
    public void makeOrder(String goods) {
        shop.setGoodsToOrder(goods);
        storage.setGoods(goods);
        delivery.setGoods(goods);
        shop.consultClient();
        shop.checkAvailability();
        shop.checkPrice();
        shop.acceptOrder();
        storage.findOnStorage();
        storage.passGoodsToDelivery();
        delivery.packGoods();
        delivery.deliverGoods();
        delivery.handGoods();
    }
}
