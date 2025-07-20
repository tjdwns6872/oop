package newStudyFile.day_7_1;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {

    private List<Subscriber> subscriber = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        this.subscriber.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        this.subscriber.remove(subscriber);
    }

    public void sendMessage(String message){
        for(Subscriber subscriber: subscriber){
            subscriber.sendMessage(message);
        }
    }
}
