package newStudyFile.day_9.controller;

import newStudyFile.day_9.dto.OrderRequest;
import newStudyFile.day_9.dto.OrderResponse;
import newStudyFile.day_9.model.service.OrderService;

public class OrderController {
    
    public OrderResponse handleOrder(OrderRequest request){
        return new OrderService().orderSystem(request);
    } 
}
