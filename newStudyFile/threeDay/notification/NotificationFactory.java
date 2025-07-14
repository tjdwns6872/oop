package newStudyFile.threeDay.notification;

public class NotificationFactory {

    public NotificationStrategy createNotification(String type){
        switch (type) {
            case "SMS":
                return new Sms();
            case "Email":
                return new Email();
            case "Push":
                return new Push();
            default:
                throw new IllegalArgumentException("존재하지 않는 알림 방식입니다.");
        }
    }
}
