package training.factory_3;

public class start {
    
    public static void main(String[] args) {
        // Email Notification
        NotificationFactory emailFactory = new EmailFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.send("Welcome to our service!");

        // SMS Notification
        NotificationFactory smsFactory = new SMSFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.send("Your OTP is 123456.");

        // Push Notification
        NotificationFactory pushFactory = new PushFactory();
        Notification pushNotification = pushFactory.createNotification();
        pushNotification.send("You have a new friend request!");
    }
}
