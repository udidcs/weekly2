
public class Main {
    public static void main(String[] args) {

        Product pro = new Beauty("장미화장품", 20000, 1);
        Integer deliveryCharge = pro.getDeliveryCharge();
        if (deliveryCharge == null)
            System.out.println("배송비는 무료입니다");
        else {
            System.out.println("배송비는 " + deliveryCharge + "입니다.");
        }
    }
}