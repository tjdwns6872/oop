package newStudyFile.day_10.controller;

import newStudyFile.day_10.dto.NotificationRequest;
import newStudyFile.day_10.dto.NotificationResponse;
import newStudyFile.day_10.model.service.Service;
import newStudyFile.day_10.model.service.ServiceImpl;

public class NotificationController {
    
    public NotificationResponse handleNotification(NotificationRequest request){
        Service service = new ServiceImpl();
        return service.NotificationSystem(request);
    }
}
