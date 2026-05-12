package java_hm_10;

import java_hm_10.enums.TeaType;

class TeaOrder extends Order {

    private TeaType type;
    public TeaOrder(int orderNumber, TeaType type) {
        super(orderNumber);
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        this.type = type;
    }

    public TeaType getType(){
        return type;
    }

    @Override
    public double getPrice() {
        return switch (type) {
            case TeaType.BLACK -> 2.0;
            case TeaType.GREEN-> 2.2;
            case TeaType.HERBAL -> 2.5;
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Tea (" + type + ") | Status: " + status);
    }
}
