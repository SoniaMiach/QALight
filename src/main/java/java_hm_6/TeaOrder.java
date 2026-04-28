package java_hm_6;

public class TeaOrder extends Order{
    private String type;

    public TeaOrder(String orderNumber, String type) {
        super(orderNumber);
        this.type = type;
    }

    @Override
    public double getPrice() {
        return switch (type.toLowerCase()) {
            case "black" -> 2.0;
            case "green" -> 2.2;
            case "herbal" -> 2.5;
            default -> throw new IllegalArgumentException("Unknown tea type: " + type);
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Tea (" + type + ")");
    }
}
