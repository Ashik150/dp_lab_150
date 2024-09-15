public class NotificationService {
    public static void sendNotification(String message, Rider rider, NotificationType type) {
        switch (type) {
            case SMS:
                System.out.println("Sending SMS to " + rider.getName() + ": " + message);
                break;
            case EMAIL:
                System.out.println("Sending Email to " + rider.getName() + ": " + message);
                break;
            case IN_APP:
                System.out.println("Sending In-App notification to " + rider.getName() + ": " + message);
                break;
        }
    }
}

enum NotificationType {
    SMS, EMAIL, IN_APP;
}

