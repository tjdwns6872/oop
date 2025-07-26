package newStudyFile.day_11.view;

import newStudyFile.day_11.dto.NotificationResponse;

public class NotificationView {
    public void render(NotificationResponse response){
        System.out.println(response.getMessage());
        System.out.println("회원 유형: "+response.getType());
    }
}
