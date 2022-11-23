package mycart;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    private OrderServiceMock orderService = new OrderServiceMock();

    public void runExerciseOriginal() {
        //Using the order Service, return orders for customer id 95 where any item in the order was worth more than 2500.00
        List<OnlineOrder> customerOrders = orderService.getOrdersForCustomer(95);

        List<OnlineOrder> matchingOrders = new ArrayList<>();

        for(OnlineOrder o : customerOrders) {
            Cart c = o.getCart();
            for(CartItem item : c.getCartItems()) {
                if(item.getPrice() > 2500) {
                    matchingOrders.add(o);
                    break;
                }
            }
        }
        System.out.println(matchingOrders);
    }

    public void runExerciseFunctional() {
        //Using the order Service, return orders for customer id 95 where any item in the order was worth more than 2500.00
        List<OnlineOrder> customerOrders = orderService.getOrdersForCustomer(95);

        List<OnlineOrder> matchingOrders = new ArrayList<>();
        matchingOrders = customerOrders.stream()
                .filter(o -> o.getCart().getCartItems().stream()
                        .anyMatch(i -> i.getPrice() > 2500)).collect(Collectors.toList());
        System.out.println(matchingOrders);
    }

}
