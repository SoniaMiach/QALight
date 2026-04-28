package java_hm_10;

class DessertOrder extends Order {

    private String dessertName;
    public DessertOrder(int orderNumber, String dessertName) {
        super(orderNumber);
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        return switch (dessertName.toLowerCase()) {
            case "cake" -> 4.0;
            case "cookie" -> 1.5;
            case "brownie" -> 3.0;
            default -> 2.5;
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + orderNumber + " | Dessert (" + dessertName + ") | Status: " + status);
    }
}
