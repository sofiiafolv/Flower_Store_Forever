package ucu.edu.ua.demo.order;

import lombok.ToString;
import ucu.edu.ua.demo.delivery.Delivery;
import ucu.edu.ua.demo.delivery.PostDeliveryStrategy;
import ucu.edu.ua.demo.item.CactusFlower;
import ucu.edu.ua.demo.item.Item;
import ucu.edu.ua.demo.payment.PayPalPaymentStrategy;
import ucu.edu.ua.demo.payment.Payment;

import java.util.LinkedList;
@ToString
public class Order {
    private LinkedList<Item> items = new LinkedList<Item>();
    private Payment payment;
    private Delivery delivery;
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        for(int i = 0;i < items.size();++i){
            if (items.get(i) == item){
                items.remove(i);
            }
        }
    }
    public void processOrder(){
        System.out.println("Processing Order...\n"+"Amount to pay: "+calculateTotalPrice()
                +"\nType of Payment: "+payment.getTypeOfPayment()+"\nType of Delivery: "
                +delivery.getTypeOfDelivery());
    }
}
