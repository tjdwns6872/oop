package newStudyFile.day_10.model.decorator;

import newStudyFile.day_10.model.notification.Notification;

public abstract class NotificationDecorator extends Notification{

    protected Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }

}
