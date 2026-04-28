package java_hm_7;

abstract class Order implements Pricable, Printable {

    protected String orderNumber;
    protected OrderStatus status;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.NEW;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
