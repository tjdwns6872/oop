package training.observer_2;

public class Follower {
    
    private String name;

    public Follower(String name){
        this.name = name;
    }

    public void alarm(String topic){
        System.out.println(name+" received notification: "+topic);
    }
}
