package payment;
import delivery.DHLDeliveryStrategy;
import delivery.PostDeliverStrategy;
import flowers.Flower;
import flowers.FlowerType;
import flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    private PayPalPaymentStrategy payPal;
    private CreditCardPaymentStrategy credit;
    @BeforeEach
    void setUP(){
        payPal = new PayPalPaymentStrategy();
        credit = new CreditCardPaymentStrategy();
    }
    @Test
    void PayPalPayment(){
        assertTrue(payPal.pay(100));
    }

    @Test
    void CreditCardPayment(){
        assertTrue(credit.pay(100));
    }

}
