package Client_Code;

import Adapter.PostalMailAdapter;
import Concrete_Class.EmailNotification;
import Concrete_Class.SMSNotification;
import Interface.Notification;
import ThirdParty.ThirdPartyPostalMail;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        ThirdPartyPostalMail thirdPartyPostalMail = new ThirdPartyPostalMail();
        Notification postalMailNotification = new PostalMailAdapter(thirdPartyPostalMail);

        emailNotification.send("Ashik@example.com", "This is an email message");
        smsNotification.send("123456789", "This is an SMS message");
        postalMailNotification.send("Bhuter Goli, 1200", "This is a postal mail message");
    }
}
