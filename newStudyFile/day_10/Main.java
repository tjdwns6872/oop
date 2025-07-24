package newStudyFile.day_10;
import newStudyFile.day_10.controller.NotificationController;
import newStudyFile.day_10.dto.NotificationRequest;
import newStudyFile.day_10.dto.NotificationRequestBuilder;
import newStudyFile.day_10.dto.TypeEnum;
import newStudyFile.day_10.view.NotificationView;

public class Main {
    public static void main(String[] args) {
        NotificationRequest request = new NotificationRequestBuilder()
                                .type(TypeEnum.Email)
                                .isPremium(true)
                                .useAdMessage(true)
                                .useSecurityAlert(false)
                                .useCoupon(true)
                                .build();

        NotificationController controller = new NotificationController();
        var response = controller.handleNotification(request);

        NotificationView view = new NotificationView();
        view.render(response);
    }
}
