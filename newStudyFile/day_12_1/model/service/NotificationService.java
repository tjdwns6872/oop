package newStudyFile.day_12_1.model.service;

import newStudyFile.day_12_1.dto.NotificationRequest;
import newStudyFile.day_12_1.dto.NotificationResponse;

public interface NotificationService {
    public NotificationResponse NotificationSystem(NotificationRequest request);
}
