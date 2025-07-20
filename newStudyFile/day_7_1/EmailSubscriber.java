package newStudyFile.day_7_1;

public class EmailSubscriber implements Subscriber{

    @Override
    public void sendMessage(String message) {
        System.out.println("[이메일] 새로운 뉴스 도착: "+message);
    }
    
}
