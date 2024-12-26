package training.observer_3;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    List<Observer> list;

    public Subject(){
        this.list = new ArrayList<>();
    }

    public void write(String massage){
        for(Observer observer : list){
            StringBuilder sb = new StringBuilder();
            sb.append(observer.getName());
            sb.append(" received notification: ");
            sb.append(massage);
            observer.alarm(sb.toString());
        }
    }

    public void add(Observer observer){
        list.add(observer);
    }

    public void remove(Observer observer){
        StringBuilder sb = new StringBuilder();
        sb.append(observer.getName());
        sb.append(" removed.");
        observer.alarm(sb.toString());
        list.remove(observer);
    }
}
