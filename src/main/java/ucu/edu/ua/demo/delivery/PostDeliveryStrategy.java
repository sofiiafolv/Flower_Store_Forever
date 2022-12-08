package ucu.edu.ua.demo.delivery;

import ucu.edu.ua.demo.item.CactusFlower;
import ucu.edu.ua.demo.item.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String getTypeOfDelivery() {
        return "Post Delivery";
    }

    @Override
    public boolean deliver(LinkedList<Item> items) {
        System.out.println("Your order: "+items+".");
        System.out.println("The order will be delivered by post.");
        return true;
    }
}


