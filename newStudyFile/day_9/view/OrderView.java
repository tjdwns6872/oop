package newStudyFile.day_9.view;

import newStudyFile.day_9.dto.OrderResponse;

public class OrderView {
    
    public void render(OrderResponse response){
        System.out.println("배송 타입: "+response.getOrderType());
        System.out.println("총 가격: "+response.getFinalPrice());
        System.out.println("할인 정보: "+response.getDiscountInfo());
    }
}
