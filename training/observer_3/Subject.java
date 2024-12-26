package training.observer_3;

public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObservers(String message);
}
