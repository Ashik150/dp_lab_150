package ThirdParty;

public class ThirdPartyPostalMail {
    public void sendPostalMail(String recipientAddress, String postalCode, String message) {
        System.out.println("Sending Postal Mail to: " + recipientAddress + ", Postal Code: " + postalCode);
        System.out.println("Message: " + message);
    }
}
