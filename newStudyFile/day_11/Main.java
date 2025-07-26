package newStudyFile.day_11;

import newStudyFile.day_11.controller.NotificationController;
import newStudyFile.day_11.dto.NotificationRequest;
import newStudyFile.day_11.dto.NotificationRequestBuilder;
import newStudyFile.day_11.dto.NotificationResponse;
import newStudyFile.day_11.view.NotificationView;

public class Main {
    public static void main(String[] args) {
        // 1. 사용자 입력 시뮬레이션 (Request 생성)
        NotificationRequest request = new NotificationRequestBuilder()
                                    .message("이벤트에 참여해주셔서 감사합니다!")
                                    .premium(true)
                                    .useHeader(true)
                                    .useFooter(true)
                                    .build();
        // 2. Controller 호출 → Service 처리 → Response 반환
        NotificationController controller = new NotificationController();
        NotificationResponse response = controller.handleNotification(request);

        // // 3. View에 결과 렌더링
        NotificationView view = new NotificationView();
        view.render(response);
    }
}
