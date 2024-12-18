package Concrete_Classes;
import Interfaces.SocialMediaService;
import Models.Notification;
import java.util.ArrayList;
import java.util.List;


public class TwitterService implements SocialMediaService {
    @Override
    public List<Notification> getNotifications() {
        // Mocked data for demonstration
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("1", "New follower on Twitter!", "Twitter", false));
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("Twitter: Marked notification " + notificationId + " as read.");
    }

    @Override
    public void markAsUnread(String notificationId) {
        System.out.println("Twitter: Marked notification " + notificationId + " as unread.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleted notification " + notificationId + ".");
    }
}
