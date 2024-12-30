package training.factory_3;

public class EmailFactory extends NotificationFactory{

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    
}
