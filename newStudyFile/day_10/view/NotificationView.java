package newStudyFile.day_10.view;

import newStudyFile.day_10.dto.NotificationResponse;

public class NotificationView {
    
    public void render(NotificationResponse response){
        System.out.println(response.getType());
        System.out.println(response.getUserType()); 
    }
}
