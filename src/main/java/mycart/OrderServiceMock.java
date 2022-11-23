package mycart;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceMock {

    //Mock
    public List<OnlineOrder> getOrdersForCustomer(long id) {
        //just ignore the id and return the list of online orders for testing
        List<OnlineOrder> orders = new ArrayList<>();
        orders.add(getOnlineOrder(1,false));
        orders.add(getOnlineOrder(2,true));
        orders.add(getOnlineOrder(3,false));

        return orders;
    }

    public OnlineOrder getOnlineOrder(long orderId, boolean matches) {
        return new OnlineOrder(orderId, getCart(matches));
    }

    public Cart getCart(boolean matches) {
        return new Cart(fillCartItems(matches));
    }

    public List<CartItem> fillCartItems(boolean matches) {
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(10, "cheap"));
        items.add(new CartItem(2499.99, "almost"));
        if (matches) {
            items.add(new CartItem(2500.01, "justover"));
            items.add(new CartItem(2700.59, "expensive"));
        }
        items.add(new CartItem(250.00, "nope"));
        return items;
    }


}
