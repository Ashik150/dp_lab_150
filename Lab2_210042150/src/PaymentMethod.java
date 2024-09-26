public interface PaymentMethod {
    boolean processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private double balance;

    public CreditCardPayment(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Credit Card payment of $" + amount + " successful.");
            return true;
        } else {
            System.out.println("Insufficient funds in Credit Card.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Bkash implements PaymentMethod {
    private String email;
    private double balance;

    public Bkash(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Bkash payment of $" + amount + " successful.");
            return true;
        } else {
            System.out.println("Insufficient funds in Bkash.");
            return false;
        }
    }


    public double getBalance() {
        return balance;
    }
}