package training.observer_3;

public class start {
    
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new Observer("observer1");
        Observer observer2 = new Observer("observer2");

        subject.add(observer1);
        subject.add(observer2);

        subject.write("Event Occurred!");

        subject.remove(observer2);

        subject.write("Event Occurred!");
    }
}
