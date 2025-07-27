package newStudyFile.day_12_1.controller;

import newStudyFile.day_12_1.dto.NotificationRequest;
import newStudyFile.day_12_1.dto.NotificationResponse;
import newStudyFile.day_12_1.model.service.NotificationService;
import newStudyFile.day_12_1.model.service.NotificationServiceImpl;

public class NotificationController {
    
    public NotificationResponse handleNotification(NotificationRequest request){
        NotificationService service = new NotificationServiceImpl(); 
        return service.NotificationSystem(request);
    }
}
