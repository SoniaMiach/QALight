package java_hm_10;

import java_hm_10.enums.OrderStatus;

abstract class Order implements Pricable, Printable {

    protected int orderNumber;
    protected OrderStatus status;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.NEW;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
