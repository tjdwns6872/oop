import java.text.SimpleDateFormat;

public class Logger {

    private static Logger instance;

    private Logger() {}

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public synchronized void log(String message){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sb.append(String.format("[%s]: ", sdf.format(System.currentTimeMillis())));
        sb.append(message);
        System.out.println(sb.toString());
    }
}