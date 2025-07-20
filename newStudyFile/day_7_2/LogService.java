package newStudyFile.day_7_2;

public class LogService implements Service{

    @Override
    public void send(String type, String amount) {
        if (type.equals("deposit")) {
            System.out.println("[로그] 입금 감지: " + amount);
        } else if (type.equals("withdraw")) {
            System.out.println("[로그] 출금 감지: " + amount);
        }
    }
    
}
