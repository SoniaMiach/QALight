package java_hm_6;

abstract class Order {
    protected String orderNumber;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public abstract double getPrice();

    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + ", Type: " + getClass().getSimpleName());
    }
}
