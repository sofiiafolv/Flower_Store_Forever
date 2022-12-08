package ucu.edu.ua.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.demo.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.demo.delivery.Delivery;
import ucu.edu.ua.demo.delivery.PostDeliveryStrategy;
import ucu.edu.ua.demo.item.Item;
import ucu.edu.ua.demo.payment.CreditCartPaymentStrategy;
import ucu.edu.ua.demo.payment.PayPalPaymentStrategy;
import ucu.edu.ua.demo.payment.Payment;

import java.util.LinkedList;

public class PaymentTest {
    @Test
    public void testPaymentStrategy(){
        Payment payment = new CreditCartPaymentStrategy();
        Assertions.assertEquals(payment.getTypeOfPayment(), "Credit Card");
        Assertions.assertTrue(payment.pay(12));
        Payment payment1 = new PayPalPaymentStrategy();
        Assertions.assertEquals(payment1.getTypeOfPayment(), "PayPal");
        Assertions.assertTrue(payment1.pay(15));
    }
}
