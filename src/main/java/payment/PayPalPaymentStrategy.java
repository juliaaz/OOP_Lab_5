package payment;

public class PayPalPaymentStrategy implements Payment{
    public boolean pay(double price){
        System.out.println("Payment of "+ price+ " hryvnias made by PayPal.");
        return true;
    }
}
