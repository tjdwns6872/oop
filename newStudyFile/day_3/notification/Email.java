package newStudyFile.day_3.notification;

public class Email implements NotificationStrategy{

    @Override
    public void notification() {
        System.out.println("[알림] 이메일로 알림 전송 완료");
    }
    
}
