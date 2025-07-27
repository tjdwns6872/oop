package newStudyFile.day_12_1;

import newStudyFile.day_12_1.controller.NotificationController;
import newStudyFile.day_12_1.dto.NotificationRequest;
import newStudyFile.day_12_1.dto.NotificationRequestBuilder;
import newStudyFile.day_12_1.dto.NotificationResponse;
import newStudyFile.day_12_1.view.NotificationView;

public class Main {
    public static void main(String[] args) {
        // 1. 사용자 요청 생성 (예: Email, SMS, Push 선택)
        NotificationRequest request = new NotificationRequestBuilder()
                                        .id("user@example.com")
                                        .type("Push")
                                        .message("가입을 환영합니다!")
                                        .build();

        // // 2. Controller 호출 → Service → Template 처리
        NotificationController controller = new NotificationController();
        NotificationResponse response = controller.handleNotification(request);

        // // 3. View로 결과 출력
        NotificationView view = new NotificationView();
        view.render(response);
    }
}
