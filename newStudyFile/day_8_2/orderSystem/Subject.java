package newStudyFile.day_8_2.orderSystem;

public interface Subject {
    void subscribe(Observer observer, String message);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
