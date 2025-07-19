package newStudyFile.day_3.notification;

public class Sms implements NotificationStrategy{

    @Override
    public void notification() {
        System.out.println("[알림] 문자로 알림 전송 완료");
    }
    
}
