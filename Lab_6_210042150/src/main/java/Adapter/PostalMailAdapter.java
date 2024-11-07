package Adapter;

import Interface.Notification;

import ThirdParty.ThirdPartyPostalMail;

public class PostalMailAdapter implements Notification {
    private ThirdPartyPostalMail postalMail;

    public PostalMailAdapter(ThirdPartyPostalMail postalMail)
    {
        this.postalMail = postalMail;
    }

    @Override
    public void send(String recipient,String message)
    {
        String[] recipientDetails = recipient.split(",");
        String address = recipientDetails[0].trim();
        String postalCode = recipientDetails[1].trim();


        postalMail.sendPostalMail(address,postalCode,message);
    }
}
