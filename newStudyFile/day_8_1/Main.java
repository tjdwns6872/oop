package newStudyFile.day_8_1;

public class Main {
    public static void main(String[] args) {
        EventPublisher publisher = new EventPublisher();
        Department marketing = new MarketingDept();
        Department security = new SecurityDept();
        Department crm = new CRMDept();

        publisher.subscribe("signup", marketing);
        publisher.subscribe("signup", crm);
        publisher.subscribe("withdrawal", security);

        publisher.publish("signup", "user123");

        publisher.publish("withdrawal", "user456");
    }
}
