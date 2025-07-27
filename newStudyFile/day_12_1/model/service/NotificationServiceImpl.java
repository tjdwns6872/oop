package newStudyFile.day_12_1.model.service;

import newStudyFile.day_12_1.dto.NotificationRequest;
import newStudyFile.day_12_1.dto.NotificationResponse;
import newStudyFile.day_12_1.model.template.EmailNotification;
import newStudyFile.day_12_1.model.template.PushNotification;
import newStudyFile.day_12_1.model.template.SmsNotification;

public class NotificationServiceImpl implements NotificationService{

    @Override
    public NotificationResponse NotificationSystem(NotificationRequest request) {
        NotificationResponse response = null;
        if(request.getType().equals("Email")){
            response = new EmailNotification().send(request.getId(), request.getMessage());
        }else if(request.getType().equals("Push")){
            response = new PushNotification().send(request.getId(), request.getMessage());
        }else if(request.getType().equals("SMS")){
            response = new SmsNotification().send(request.getId(), request.getMessage());
        }
        return response;
    }
    
}
