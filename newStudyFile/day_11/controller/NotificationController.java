package newStudyFile.day_11.controller;

import newStudyFile.day_11.dto.NotificationRequest;
import newStudyFile.day_11.dto.NotificationResponse;
import newStudyFile.day_11.model.service.ServiceImpl;
import newStudyFile.day_11.model.service.Service;

public class NotificationController {
    
    public NotificationResponse handleNotification(NotificationRequest request){
        Service service = new ServiceImpl();
        return service.MessageSystem(request);
    }
}
