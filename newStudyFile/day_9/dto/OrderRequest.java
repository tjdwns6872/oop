package newStudyFile.day_9.dto;

public class OrderRequest {
    private String orderType;
    private boolean isMember;

    private int totalPrice;

    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    public void setIsMember(boolean isMember){
        this.isMember = isMember;
    }
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    public String getOrderType(){
        return this.orderType;
    }
    public boolean getIsMember(){
        return this.isMember;
    }
    public int getTotalPrice(){
        return this.totalPrice;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("orderType:");
        sb.append(orderType);
        sb.append(", isMember:");
        sb.append(isMember);
        return sb.toString();
    }
}
