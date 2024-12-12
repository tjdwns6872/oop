package training.observer_2;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    
    List<Follower> list;

    public Topic(){
        this.list = new ArrayList<>();
    }

    public void write(String topic){
        for(Follower follower : list){
            follower.alarm(topic);
        }
    }

    public void add(Follower follower){
        list.add(follower);
    }
    public void remove(Follower follower){
        list.remove(follower);
    }
}
