package newStudyFile.day_7_2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.addService(new AlertService());
        account.addService(new LogService());
        account.addService(new FraudDetectionService());

        account.deposit("사기 당했다!");
        account.withdraw("철회했다!");
    }
}
