package java_hm_6;

public class OrderManager {
    public double calculateTotal(Order[] orders) {
        double total = 0;

        if (orders == null) {
            throw new IllegalArgumentException("Orders cannot be null");
        }

        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}
