package training.observer_3;

public class start {
    
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");

        subject.add(observer1);
        subject.add(observer2);

        subject.notifyObservers("Event Occurred!");

        subject.remove(observer2);

        subject.notifyObservers("Another Event!");
    }
}
