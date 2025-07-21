package newStudyFile.day_8_2.orderSystem;

import java.util.HashMap;
import java.util.Map;

public class OrderPublisher implements Subject{
    
    Map<Observer, String> observers = new HashMap<>();

    @Override
    public void subscribe(Observer observer, String message){
        this.observers.put(observer, message);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Map.Entry<Observer, String> entry: this.observers.entrySet()){
            entry.getKey().sendMessage(entry.getValue());
        }
    }
}
