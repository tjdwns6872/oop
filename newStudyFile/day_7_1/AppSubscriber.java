package newStudyFile.day_7_1;

public class AppSubscriber implements Subscriber{

    @Override
    public void sendMessage(String message) {
        System.out.println("[앱] 새로운 뉴스 도착: "+message);
    }
    
}
