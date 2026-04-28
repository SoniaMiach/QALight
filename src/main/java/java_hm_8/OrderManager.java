package java_hm_8;

import java.util.ArrayList;
import java.util.List;

class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        orders.add(order);
    }

    public void removeOrderByNumber(int orderNumber) {
        orders.removeIf(order -> order.getOrderNumber() == orderNumber);
    }

    public Order findOrderByNumber(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getOrdersByStatus(String status) {
        List<Order> result = new ArrayList<>();
        try {
            OrderStatus orderStatus = OrderStatus.valueOf(status.toUpperCase());
            for (Order order : orders) {
                if (order.getStatus() == orderStatus) {
                    result.add(order);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown status: " + status);
        }
        return result;
    }

    public double calculateTotal(List<Order> orderList) {
        if (orderList == null || orderList.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Order order : orderList) {
            if (order.getStatus() == OrderStatus.NEW) {
                total += order.getPrice();
            }
        }
        return total;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
