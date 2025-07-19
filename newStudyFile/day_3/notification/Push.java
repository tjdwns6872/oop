package newStudyFile.day_3.notification;

public class Push implements NotificationStrategy{

    @Override
    public void notification() {
        System.out.println("[알림] Push 알림 전송 완료");
    }
    
}
