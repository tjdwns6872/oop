package newStudyFile.day_9.dto;

public class OrderResponse {
    private String orderType;      // 일반 주문 / 구독 주문 등
    private int finalPrice;        // 할인 적용된 최종 금액
    private String discountInfo;   // 어떤 할인 전략이 적용되었는지

    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    public void setFinalPrice(int finalPrice){
        this.finalPrice = finalPrice;
    }
    public void setDiscountInfo(String discountInfo){
        this.discountInfo = discountInfo;
    }

    public String getOrderType(){
        return this.orderType;
    }
    public int getFinalPrice(){
        return this.finalPrice;
    }
    public String getDiscountInfo(){
        return discountInfo;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("orderType:");
        sb.append(orderType);
        sb.append(", finalPrice:");
        sb.append(finalPrice);
        sb.append(", discountInfo:");
        sb.append(discountInfo);

        return sb.toString();
    }

}

