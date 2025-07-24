package newStudyFile.day_10.model.decorator;
import newStudyFile.day_10.model.notification.Notification;

public class CouponDecorator extends NotificationDecorator{

    public CouponDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getNotification() {
        return notification.getNotification()+"[프로모션]";
    }

}
