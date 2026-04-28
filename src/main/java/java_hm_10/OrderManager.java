package java_hm_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) throws DuplicateOrderException {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        for (Order existingOrder : orders) {
            if (existingOrder.getOrderNumber() == order.getOrderNumber()) {
                throw new DuplicateOrderException("Order with number " + order.getOrderNumber() + " already exists");
            }
        }

        orders.add(order);
    }

    public void removeOrderByNumber(int orderNumber) throws OrderNotFoundException {
        boolean removed = orders.removeIf(order -> order.getOrderNumber() == orderNumber);
        if (!removed) {
            throw new OrderNotFoundException("Order with number " + orderNumber + " not found");
        }
    }

    public Order findOrderByNumber(int orderNumber) throws OrderNotFoundException {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                return order;
            }
        }
        throw new OrderNotFoundException("Order with number " + orderNumber + " not found");
    }

    public void setOrderStatus(int orderNumber, String status) throws OrderNotFoundException, InvalidOrderStatusException {
        Order order = findOrderByNumber(orderNumber);

        try {
            OrderStatus orderStatus = OrderStatus.valueOf(status.toUpperCase());
            order.setStatus(orderStatus);
        } catch (IllegalArgumentException e) {
            throw new InvalidOrderStatusException("Invalid status: " + status + ". Valid statuses are: NEW, CANCELED, COMPLETED");
        }
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

    public double calculateTotal(List<Order> orderList) throws NoOrdersException {
        if (orderList == null || orderList.isEmpty()) {
            throw new NoOrdersException("Cannot calculate total: orders list is empty");
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

    public Map<String, Integer> getOrderTypeCounts() {
        Map<String, Integer> typeCounts = new HashMap<>();
        typeCounts.put("Coffee", 0);
        typeCounts.put("Tea", 0);
        typeCounts.put("Dessert", 0);

        for (Order order : orders) {
            if (order instanceof CoffeeOrder) {
                typeCounts.put("Coffee", typeCounts.get("Coffee") + 1);
            } else if (order instanceof TeaOrder) {
                typeCounts.put("Tea", typeCounts.get("Tea") + 1);
            } else if (order instanceof DessertOrder) {
                typeCounts.put("Dessert", typeCounts.get("Dessert") + 1);
            }
        }

        return typeCounts;
    }
}
