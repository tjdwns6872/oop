package newStudyFile.day_8_2.orderSystem;

public class DeliveryNotifier implements Observer{

    @Override
    public void sendMessage(String message) {
        System.out.println("[물류팀] "+message);
    }
    
}
