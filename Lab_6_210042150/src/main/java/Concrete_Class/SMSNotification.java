package Concrete_Class;

import Interface.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("Message: " + message);
    }
}
