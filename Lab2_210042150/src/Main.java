import java.util.Scanner;
class CashPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cash payment of $" + amount + " accepted.");
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Your Default Payment method is Cash.Enter 'yes' or 'no' for further proceed:");
        String cashOption = scanner.nextLine();

        PaymentMethod paymentMethod = null;
        boolean paymentSuccess = false;

        if (cashOption.equalsIgnoreCase("yes")) {
            paymentMethod = new CashPayment();
            paymentSuccess = paymentMethod.processPayment(amount);
        }

        if (!paymentSuccess) {
            System.out.println("Choose payment method: 1 for Credit Card, 2 for Bkash");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                // Credit Card option chosen, ask for details
                System.out.print("Enter your Credit Card number: ");
                String creditCardNumber = scanner.nextLine();
                System.out.print("Enter balance for Credit Card: ");
                double creditCardBalance = scanner.nextDouble();

                CreditCardPayment creditCard = new CreditCardPayment(creditCardNumber, creditCardBalance);
                paymentMethod = creditCard;

                // Try to process payment with credit card
                paymentSuccess = creditCard.processPayment(amount);

                if (!paymentSuccess) {
                    System.out.println("Insufficient funds in Credit Card. Switching to PayPal...");
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter your PayPal email: ");
                    String paypalEmail = scanner.nextLine();
                    System.out.print("Enter balance for Baksh: ");
                    double bkashBalance = scanner.nextDouble();
                    Bkash bkash = new Bkash(paypalEmail, bkashBalance);
                    paymentSuccess = bkash.processPayment(amount);
                }
            } else if (choice == 2) {
                // PayPal option chosen, ask for details
                System.out.print("Enter your Bkash email: ");
                String BkashEmail = scanner.nextLine();
                System.out.print("Enter balance for Bkash: ");
                double BkashBalance = scanner.nextDouble();

                Bkash bkash = new Bkash(BkashEmail, BkashBalance);
                paymentMethod = bkash;

                // Try to process payment with PayPal
                paymentSuccess = bkash.processPayment(amount);

                if (!paymentSuccess) {
                    System.out.println("Insufficient funds in Bkash. Switching to Credit Card...");
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter your Credit Card number: ");
                    String creditCardNumber = scanner.nextLine();
                    System.out.print("Enter balance for Credit Card: ");
                    double creditCardBalance = scanner.nextDouble();

                    CreditCardPayment creditCard = new CreditCardPayment(creditCardNumber, creditCardBalance);
                    paymentSuccess = creditCard.processPayment(amount);
                }
            }
        }

        if (!paymentSuccess) {
            System.out.println("Both payment methods failed. Transaction canceled.");
        }

        scanner.close();
    }
}