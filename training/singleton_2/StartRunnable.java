public class StartRunnable extends Thread{
    
    private Logger log = Logger.getInstance();
    
    @Override
    public void run() {
        log.log("First log from Thread-1");
        log.log("Second log from Thread-2");
    }
}
