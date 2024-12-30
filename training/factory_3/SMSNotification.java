package training.factory_3;

public class SMSNotification implements Notification{

    private String message;

    public SMSNotification(){
        this.message = "Sending SMS: ";
    }

    @Override
    public void send(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.message);
        sb.append(message);
        System.out.println(sb.toString());
    }
    
}
