package training.observer_3;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void alarm(String message) {
        System.out.println(message);
    }
    
}
