package java_hm_8;

class TeaOrder extends Order {

    private String type;
    public TeaOrder(int orderNumber, String type) {
        super(orderNumber);

        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        this.type = type;
    }

    @Override
    public double getPrice() {
        return switch (type.toLowerCase()) {
            case "black" -> 2.0;
            case "green" -> 2.2;
            case "herbal" -> 2.5;
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Tea (" + type + ") | Status: " + status);
    }
}

