package mycart;

public class OnlineOrder {

    // each order contains exactly one cart entry
    private Cart cart;
    private long id;

    public OnlineOrder(long id, Cart cart) {
        this.id = id;
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "OrderId: " + id;
    }
}
