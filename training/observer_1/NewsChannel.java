package training.observer_1;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {

    private List<Subscriber> subscribers;

    public NewsChannel() {
        this.subscribers = new ArrayList<>();
    }
    
    public void write(String news){
        for (Subscriber sub : subscribers) {
            sub.alarm(news);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // 구독자 제거
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
