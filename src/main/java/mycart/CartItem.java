package mycart;

public class CartItem {
    private double price;
    private String name;

    public CartItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CartItem: " + name + " $" + price;
    }
}
