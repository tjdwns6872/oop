package newStudyFile.day_7_1;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        publisher.subscribe(new AppSubscriber());
        publisher.subscribe(new EmailSubscriber());
        publisher.subscribe(new WebSubscriber());

        publisher.sendMessage("ChatGPT, 세계를 바꾸다!");
    }
}
