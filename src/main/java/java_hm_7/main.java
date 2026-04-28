package java_hm_7;

public class main {
    public static void main(String[] args) {

        Order[] orders = {
                new CoffeeOrder("001", "small"),
                new CoffeeOrder("002", "large"),
                new TeaOrder("003", "green"),
                new DessertOrder("004", "cake")
        };

        for (Order order : orders) {
            order.printOrderInfo();
        }

        orders[1].setStatus(OrderStatus.CANCELED);

        System.out.println("\nAfter cancel:");

        for (Order order : orders) {
            order.printOrderInfo();
        }

        OrderManager manager = new OrderManager();
        double total = manager.calculateTotal(orders);

        System.out.println("\nTotal (only NEW): " + total);
    }
}
