package newStudyFile.day_8_2.orderSystem;

public class MarketingNotifier implements Observer{

    @Override
    public void sendMessage(String message) {
        System.out.println("[마케팅] "+message);
    }
    
}
