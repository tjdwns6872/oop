package training.singleton_3;

public class Logger {
    
    private static Logger instance;

    private Logger(){
        System.out.println("Logger created!");
    };

    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        StringBuilder sb = new StringBuilder();
        sb.append("[Singleton] Log: ");
        sb.append(message);
        System.out.println(sb.toString());
    }
}
