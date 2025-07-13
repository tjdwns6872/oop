package newStudyFile.twoDay;

public class Express implements DeliveryStrategy{

    @Override
    public void delivery() {
        System.out.println("[배송 방식] 택배 기사에게 빠른 배송 요청됨.");
    }
    
}
