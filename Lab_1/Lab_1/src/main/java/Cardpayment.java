public class Cardpayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("total Payment:"+amount);
    }
}
