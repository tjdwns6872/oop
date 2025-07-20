package newStudyFile.day_7_2;

public interface Subject {
    void addService(Service service);
    void removeService(Service service);
    void send(String type, String amount);
}
