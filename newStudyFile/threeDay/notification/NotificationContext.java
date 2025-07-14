package newStudyFile.threeDay.notification;

public class NotificationContext {
    
    private NotificationStrategy notificationStrategy;

    public NotificationContext(NotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;
    }

    public void execute(){
        notificationStrategy.notification();
    }
}
