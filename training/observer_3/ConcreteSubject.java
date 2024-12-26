package training.observer_3;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> observer;

    public ConcreteSubject(){
        this.observer = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        this.observer.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        System.out.println(observer.getName()+" removed.");
        this.observer.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : this.observer){
            observer.alarm(observer.getName()+" received notification: "+message);
        }
    }
    
}
