package newStudyFile.day_10.model.service;

import newStudyFile.day_10.dto.NotificationRequest;
import newStudyFile.day_10.dto.NotificationResponse;
import newStudyFile.day_10.model.decorator.AdDecorator;
import newStudyFile.day_10.model.decorator.CouponDecorator;
import newStudyFile.day_10.model.decorator.SecurityAlertDecorator;
import newStudyFile.day_10.model.notification.Notification;
import newStudyFile.day_10.model.notification.NotificationFactory;

public class ServiceImpl implements Service{

    @Override
    public NotificationResponse NotificationSystem(NotificationRequest request) {
        Notification notification = NotificationFactory.createNotification(request.getType());

        notification.setPriority(request.getIsPremium());
        if(request.getUseAdMessage()){
            notification = new AdDecorator(notification);
        }
        if(request.getUseCoupon()){
            notification = new CouponDecorator(notification);
        }
        if(request.getUseSecurityAlert()){
            notification = new SecurityAlertDecorator(notification);
        }
        NotificationResponse response = new NotificationResponse();
        response.setType(notification.getNotification());
        response.setUserType(notification.getPriority());
        return response;
    }
    
}
