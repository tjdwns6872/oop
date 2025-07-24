package newStudyFile.day_10.model.decorator;

import newStudyFile.day_10.model.notification.Notification;

public class AdDecorator extends NotificationDecorator{

    public AdDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNotification() {
        return notification.getNotification()+"[광고]";
    }

}
