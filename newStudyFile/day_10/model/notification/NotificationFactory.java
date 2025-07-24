package newStudyFile.day_10.model.notification;

import newStudyFile.day_10.dto.TypeEnum;

public class NotificationFactory {
    
    public static Notification createNotification(TypeEnum type){
        switch (type) {
            case Email:
                return new EmailNotification();
            case Push:
                return new PushNotification();
            case SMS:
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("존재하지 않는 알림 타입입니다.");
        }
    }
}
