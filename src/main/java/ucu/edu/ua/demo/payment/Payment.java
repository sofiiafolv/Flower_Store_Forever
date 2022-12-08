package ucu.edu.ua.demo.payment;

public interface Payment {
    String getTypeOfPayment();
    boolean pay(double price);
}
