package training.observer_3;

public class Observer {
    
    private String name;

    public Observer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void alarm(String message){
        System.out.println(message);
    }
}
