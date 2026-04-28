package java_hm_9;

class CoffeeOrder extends Order {

    private String size;
    public CoffeeOrder(int orderNumber, String size) {
        super(orderNumber);

        if (size == null) {
            throw new IllegalArgumentException("Size cannot be null");
        }

        this.size = size;
    }

    @Override
    public double getPrice() {
        return switch (size.toLowerCase()) {
            case "small" -> 2.5;
            case "medium" -> 3.5;
            case "large" -> 4.5;
            default -> throw new IllegalArgumentException("Unknown size: " + size);
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Coffee (" + size + ") | Status: " + status);
    }
}
