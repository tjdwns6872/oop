package training.factory_3;

public class SMSFactory extends NotificationFactory{

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
    
}
