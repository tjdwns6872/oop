package newStudyFile.day_2;

public class Standard implements DeliveryStrategy{

    @Override
    public void delivery() {
        System.out.println("[배송 방식] 택배 기사에게 기본 배송 요청됨.");
    }
    
}
