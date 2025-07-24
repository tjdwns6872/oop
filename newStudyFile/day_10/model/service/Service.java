package newStudyFile.day_10.model.service;

import newStudyFile.day_10.dto.NotificationRequest;
import newStudyFile.day_10.dto.NotificationResponse;

public interface Service {
    public NotificationResponse NotificationSystem(NotificationRequest request);
}
