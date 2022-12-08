package ucu.edu.ua.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String getTypeOfPayment() {
        return "PayPal";
    }

    @Override
    public boolean pay(double price) {
        System.out.println("The amount to be paid is "+price+".");
        System.out.println("The operation is successful. Thank you for using our PayPal payment services");
        return true;
    }

    public static void main(String[] args) {
        PayPalPaymentStrategy pp = new PayPalPaymentStrategy();
        pp.pay(2.2);
    }
}
