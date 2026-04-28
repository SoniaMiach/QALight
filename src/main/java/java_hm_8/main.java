package java_hm_8;

public class main {
    public static void main(String[] args) {
        // Створити OrderManager
        OrderManager manager = new OrderManager();

        manager.addOrder(new CoffeeOrder(1, "small"));
        manager.addOrder(new CoffeeOrder(2, "large"));
        manager.addOrder(new TeaOrder(3, "green"));
        manager.addOrder(new DessertOrder(4, "cake"));
        manager.addOrder(new TeaOrder(5, "black"));

        System.out.println("=== All Orders ===");
        for (Order order : manager.getAllOrders()) {
            order.printOrderInfo();
        }

        System.out.println("\n=== Changing Order #2 status to CANCELED ===");
        Order order2 = manager.findOrderByNumber(2);
        if (order2 != null) {
            order2.setStatus(OrderStatus.CANCELED);
            order2.printOrderInfo();
        }

        System.out.println("\n=== Removing Order #4 ===");
        manager.removeOrderByNumber(4);

        System.out.println("\n=== Finding Order #3 ===");
        Order order3 = manager.findOrderByNumber(3);
        if (order3 != null) {
            order3.printOrderInfo();
        }

        System.out.println("\n=== Orders with status NEW ===");
        for (Order order : manager.getOrdersByStatus("NEW")) {
            order.printOrderInfo();
        }

        System.out.println("\n=== Calculating Total for NEW orders ===");
        double total = manager.calculateTotal(manager.getOrdersByStatus("NEW"));
        System.out.println("Total for NEW orders: $" + total);

        System.out.println("\n=== Final Orders ===");
        for (Order order : manager.getAllOrders()) {
            order.printOrderInfo();
        }
    }
}

