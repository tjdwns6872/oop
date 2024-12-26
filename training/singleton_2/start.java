public class start {
    public static void main(String[] args) {
        StartRunnable thread1 = new StartRunnable();
        StartRunnable thread2 = new StartRunnable();
        thread1.start();
        thread2.start();
    }
}
