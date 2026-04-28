package java_hm_7;

class OrderManager {
    public double calculateTotal(Order[] orders) {
        if (orders == null || orders.length == 0) {
            return 0;
        }

        double total = 0;
        for (Order order : orders) {
            if (order.getStatus() == OrderStatus.NEW) {
                total += order.getPrice();
            }
        }
        return total;
    }
}
