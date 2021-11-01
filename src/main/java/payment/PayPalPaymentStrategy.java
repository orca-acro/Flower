package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("You have to pay" + price + "for your order using PayPal");
    }
}
