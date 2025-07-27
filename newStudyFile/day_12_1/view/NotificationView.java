package newStudyFile.day_12_1.view;

import newStudyFile.day_12_1.dto.NotificationResponse;

public class NotificationView {
    
    public void render(NotificationResponse response){
        System.out.println(response.getReceiver());
        System.out.println(response.getResultMessage());
        System.out.println(response.getType());
    }
}
