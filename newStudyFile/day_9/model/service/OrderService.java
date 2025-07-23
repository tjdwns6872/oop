package newStudyFile.day_9.model.service;

import newStudyFile.day_9.dto.OrderRequest;
import newStudyFile.day_9.dto.OrderResponse;
import newStudyFile.day_9.model.order.Order;
import newStudyFile.day_9.model.order.OrderFactory;

public class OrderService {
    
    public OrderResponse orderSystem(OrderRequest request){
        Order order = new OrderFactory().createOrder(request.getOrderType());
        order.setTotalPrice(request.getTotalPrice());
        order.setDiscountStrategy(request.getIsMember());

        OrderResponse response = new OrderResponse();
        response.setOrderType(order.getDetails());
        response.setFinalPrice(order.getTotalPrice());
        response.setDiscountInfo(order.getDiscount());

        System.out.println(response.toString());
        return response;
    }
}
