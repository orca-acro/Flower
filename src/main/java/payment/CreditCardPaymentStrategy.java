package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("You have to pay" + price + "for your order using credit card");
    }
}
