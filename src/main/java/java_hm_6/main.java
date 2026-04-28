package java_hm_6;

public class main {
    public static void main(String[] args) {
        Order[] orders = {
                new CoffeeOrder("001", "small"),
                new CoffeeOrder("002", "large"),
                new TeaOrder("003", "green"),
                new DessertOrder("004", "cake"),
                new CoffeeOrder(null, null)
        };

        for (Order order : orders) {
            order.printOrderInfo();
        }

        OrderManager manager = new OrderManager();
        double total = manager.calculateTotal(orders);

        System.out.println("Total price: " + total);
    }
}
