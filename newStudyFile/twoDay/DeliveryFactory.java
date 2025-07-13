package newStudyFile.twoDay;

public class DeliveryFactory {
    
    public DeliveryStrategy createDelivery(String delivery){
        switch (delivery) {
            case "Standard":
                return new Standard();
            case "Express":
                return new Express();
            case "Overnight":
                return new Overnight();
            default:
                throw new IllegalArgumentException("존재하지 않는 배송 방식입니다.");
        }
    }
}
