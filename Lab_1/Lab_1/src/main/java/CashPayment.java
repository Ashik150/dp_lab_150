public class CashPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Total Payment:"+amount);
    }
}
