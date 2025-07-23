package newStudyFile.day_9;

import newStudyFile.day_9.controller.OrderController;
import newStudyFile.day_9.dto.OrderRequest;
import newStudyFile.day_9.view.OrderView;

public class Main {
    public static void main(String[] args) {
        // 1. 사용자 입력 시뮬레이션
        OrderRequest request = new OrderRequest();
        request.setOrderType("SubscriptionOrder");   // 주문 타입
        request.setIsMember(true);                  // 회원 여부
        request.setTotalPrice(10000);

        // // 2. Controller → Service 흐름 실행
        OrderController controller = new OrderController();
        var response = controller.handleOrder(request);

        // // 3. View 출력
        OrderView view = new OrderView();
        view.render(response);
    }
}
