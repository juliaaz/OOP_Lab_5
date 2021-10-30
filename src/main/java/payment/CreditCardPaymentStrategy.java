package payment;

public class CreditCardPaymentStrategy {
        public boolean pay(double price){
            System.out.println("Payment of "+ price+ " hryvnias made by credit card.");
            return true;
        }
    }
