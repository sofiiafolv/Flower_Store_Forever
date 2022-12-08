package ucu.edu.ua.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.demo.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.demo.delivery.Delivery;
import ucu.edu.ua.demo.delivery.PostDeliveryStrategy;
import ucu.edu.ua.demo.item.Item;

import java.util.LinkedList;

public class DeliveryTest {
    @Test
    public void testDeliveryStrategy(){
        Delivery delivery = new PostDeliveryStrategy();
        Assertions.assertEquals(delivery.getTypeOfDelivery(), "Post Delivery");
        LinkedList<Item> items = new LinkedList<Item>();
        Assertions.assertTrue(delivery.deliver(items));
        Delivery delivery1 = new DHLDeliveryStrategy();
        Assertions.assertEquals(delivery1.getTypeOfDelivery(), "DHL Delivery");
        Assertions.assertTrue(delivery.deliver(items));
    }
}
