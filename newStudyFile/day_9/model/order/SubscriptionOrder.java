package newStudyFile.day_9.model.order;

public class SubscriptionOrder extends Order{

    @Override
    public String getDetails() {
        return "[구독 배송]";
    }
    
}
