package newStudyFile.day_8_2.order;

public class NormalOrder extends Order{

    @Override
    public String getDetails() {
        StringBuffer sb = new StringBuffer();
        sb.append("[일반 주문] 금액: ");
        sb.append(getTotalPrice());
        sb.append("원");
        return sb.toString();
    }
    
}
