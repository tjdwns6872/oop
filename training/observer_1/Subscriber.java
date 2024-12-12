package training.observer_1;

public class Subscriber {
    
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void alarm(String news){
        System.out.println(name + ": " + news);
    }
}
