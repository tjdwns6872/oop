package newStudyFile.day_7_1;

public class WebSubscriber implements Subscriber{

    @Override
    public void sendMessage(String message) {
        System.out.println("[웹] 새로운 뉴스 도착: "+message);
    }
    
}
