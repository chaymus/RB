package mycart;

import java.util.List;

public class Cart {
    private List<CartItem> cartItems;

    public Cart(List<CartItem> items){
        this.cartItems = items;
    }

    public void addItem(CartItem item) {
        this.cartItems.add(item);
    }

    public void emptyCart() {
        this.cartItems.clear();
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }
}
