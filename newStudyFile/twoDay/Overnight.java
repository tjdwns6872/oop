package newStudyFile.twoDay;

public class Overnight implements DeliveryStrategy{

    @Override
    public void delivery() {
        System.out.println("[배송 방식] 택배 기사에게 야간 배송 요청됨.");
    }
    
}
