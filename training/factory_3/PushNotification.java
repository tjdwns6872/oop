package training.factory_3;

public class PushNotification implements Notification{
    
    private String message;

    public PushNotification(){
        this.message = "Sending push notification: ";
    }

    @Override
    public void send(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.message);
        sb.append(message);
        System.out.println(sb.toString());
    }
}
