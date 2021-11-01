package flowerstore;

import delivery.Delivery;
import payment.Payment;

import java.util.List;

public class Order {
    private Payment payment;
    private Delivery delivery;
    private List<Item> items;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        return 1;
    }
}
