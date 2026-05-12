package java_hm_10;

import java_hm_10.enums.CoffeeSize;
import java_hm_10.enums.TeaType;
import java_hm_10.exceptions.DuplicateOrderException;
import java_hm_10.exceptions.InvalidOrderStatusException;
import java_hm_10.exceptions.NoOrdersException;
import java_hm_10.exceptions.OrderNotFoundException;

import java.util.Map;

public class main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        System.out.println("=== Adding Orders ===");
        try {
            manager.addOrder(new CoffeeOrder(1, CoffeeSize.SMALL));
            manager.addOrder(new CoffeeOrder(2, CoffeeSize.LARGE));
            manager.addOrder(new TeaOrder(3, TeaType.GREEN));
            manager.addOrder(new DessertOrder(4, "cake"));
            manager.addOrder(new TeaOrder(5, TeaType.BLACK));
            System.out.println("All orders added successfully");
        } catch (DuplicateOrderException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\n=== Displaying All Orders ===");
        for (Order order : manager.getAllOrders()) {
            order.printOrderInfo();
        }

        System.out.println("\n=== Order Type Counts ===");
        Map<String, Integer> typeCounts = manager.getOrderTypeCounts();
        for (String type : typeCounts.keySet()) {
            System.out.println(type + ": " + typeCounts.get(type));
        }

        // TEST 1
        System.out.println("\n=== TEST 1: Adding Duplicate Order ===");
        try {
            manager.addOrder(new CoffeeOrder(1, CoffeeSize.MEDIUM));
        } catch (DuplicateOrderException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 2
        System.out.println("\n=== TEST 2: Removing Non-Existent Order ===");
        try {
            manager.removeOrderByNumber(999);
        } catch (OrderNotFoundException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 3
        System.out.println("\n=== TEST 3: Finding Non-Existent Order ===");
        try {
            Order order = manager.findOrderByNumber(888);
        } catch (OrderNotFoundException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 4
        System.out.println("\n=== TEST 4: Setting Invalid Status ===");
        try {
            manager.setOrderStatus(1, "INVALID_STATUS");
        } catch (OrderNotFoundException | InvalidOrderStatusException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 5
        System.out.println("\n=== TEST 5: Setting Valid Status ===");
        try {
            manager.setOrderStatus(2, "CANCELED");
            System.out.println("Status changed successfully");
            Order order2 = manager.findOrderByNumber(2);
            order2.printOrderInfo();
        } catch (OrderNotFoundException | InvalidOrderStatusException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 6
        System.out.println("\n=== TEST 6: Removing Existing Order ===");
        try {
            manager.removeOrderByNumber(4);
            System.out.println("Order #4 removed successfully");
        } catch (OrderNotFoundException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 7:
        System.out.println("\n=== TEST 7: Calculating Total for Empty List ===");
        try {
            double total = manager.calculateTotal(manager.getOrdersByStatus("COMPLETED"));
        } catch (NoOrdersException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        // TEST 8
        System.out.println("\n=== TEST 8: Calculating Total for NEW Orders ===");
        try {
            double total = manager.calculateTotal(manager.getOrdersByStatus("NEW"));
            System.out.println("Total for NEW orders: $" + String.format("%.2f", total));
        } catch (NoOrdersException e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
        }

        System.out.println("\n=== Final Orders ===");
        for (Order order : manager.getAllOrders()) {
            order.printOrderInfo();
        }
    }
}
