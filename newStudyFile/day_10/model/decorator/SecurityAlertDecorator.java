package newStudyFile.day_10.model.decorator;

import newStudyFile.day_10.model.notification.Notification;

public class SecurityAlertDecorator extends NotificationDecorator{

    public SecurityAlertDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNotification() {
        return notification.getNotification()+"[보안]";
    }
}
