package ucu.edu.ua.demo.payment;

public class CreditCartPaymentStrategy implements Payment{

    @Override
    public String getTypeOfPayment() {
        return "Credit Card";
    }

    @Override
    public boolean pay(double price) {
        System.out.println("The amount to be paid is "+price+".");
        System.out.println("The operation is successful. Thank you for using our credit card payment services");
        return true;
    }
}
