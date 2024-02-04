import java.math.BigDecimal;

public class LargeAppliance extends Product {

    public LargeAppliance(String name, int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public Integer getDeliveryCharge() {
        Integer deliveryChargeByWeight = super.getDeliveryChargeByWeight();
        Integer deliveryChargeByPrice = super.getDeliveryChargeByPrice();

        if (deliveryChargeByWeight == null || deliveryChargeByPrice == null)
            return null;

        if (deliveryChargeByWeight + deliveryChargeByPrice < 0) {
            return 0;
        }
        return deliveryChargeByWeight + deliveryChargeByPrice;
    }
}
