package newStudyFile.day_11.model.service;

import newStudyFile.day_11.dto.NotificationRequest;
import newStudyFile.day_11.dto.NotificationResponse;

public interface Service {
    public NotificationResponse MessageSystem(NotificationRequest request);
}
