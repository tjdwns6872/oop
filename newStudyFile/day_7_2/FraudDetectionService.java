package newStudyFile.day_7_2;

public class FraudDetectionService implements Service{

    @Override
    public void send(String type, String amount) {
        if (type.equals("deposit")) {
            System.out.println("[탐지] 입금 감지: " + amount);
        } else if (type.equals("withdraw")) {
            System.out.println("[탐지] 출금 감지: " + amount);
        }
    }
}
