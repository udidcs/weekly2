import java.math.BigDecimal;

public abstract class Product implements DeliveryChargeCalculator {

    private String name;
    private int price;
    private double weight;

    public Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    Integer getDeliveryChargeByWeight() {
        if (weight < 3.0) {
            return 1000;
        }
        else if (3.0 <= weight && weight < 10.0) {
            return 5000;
        }
        else {
            return 10000;
        }
    }

    Integer getDeliveryChargeByPrice() {
        if (price < 30000) {
            return 0;
        }
        else if (30000 <= price && price < 100000) {
            return -1000;
        }
        else {
            return null;
        }
    }
}
