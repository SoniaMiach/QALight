package java_hm_10;

class CoffeeOrder extends Order {

    private CoffeeSize size;
    public CoffeeOrder(int orderNumber, CoffeeSize size) {
        super(orderNumber);
        if (size == null) {
            throw new IllegalArgumentException("Size cannot be null");
        }
        this.size = size;
    }

    @Override
    public double getPrice() {
        return switch (size) {
            case SMALL -> 2.5;
            case MEDIUM -> 3.5;
            case LARGE -> 4.5;
            default -> throw new IllegalArgumentException("Unknown size: " + size);
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Coffee (" + size + ") | Status: " + status);
    }
}