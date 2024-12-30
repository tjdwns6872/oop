package training.factory_3;

public class EmailNotification implements Notification{

    private String message;

    public EmailNotification(){
        this.message = "Sending email: ";
    }

    @Override
    public void send(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.message);
        sb.append(message);
        System.out.println(sb.toString());
    }
    
}
