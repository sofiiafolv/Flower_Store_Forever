package ucu.edu.ua.demo.delivery;

import ucu.edu.ua.demo.item.Item;

import java.util.LinkedList;

public interface Delivery {
    String getTypeOfDelivery();
    boolean deliver(LinkedList<Item> items);
}
