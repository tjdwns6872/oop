package training.factory_3;

public class PushFactory extends NotificationFactory{

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
    
}
