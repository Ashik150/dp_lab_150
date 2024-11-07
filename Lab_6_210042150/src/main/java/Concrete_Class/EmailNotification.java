package Concrete_Class;

import Interface.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending Email to: " + recipient);
        System.out.println("Message: " + message);
    }
}
