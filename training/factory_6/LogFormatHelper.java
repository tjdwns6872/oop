package training.factory_6;

import java.text.SimpleDateFormat;

public class LogFormatHelper {
    
    public LogFormatHelper(){};

    public String logformat(String message, FormatEnum type, String level){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        switch (type) {
            case Time:
                sb.append(String.format("[%s]: ", sdf.format(System.currentTimeMillis())));
                sb.append(message);
                return sb.toString();
            case Level:
                sb.append(level);
                sb.append(" >>> ");
                sb.append(message);
                return sb.toString();
            case All:
                sb.append(String.format("[%s]: ", sdf.format(System.currentTimeMillis())));
                sb.append(level);
                sb.append(" >>> ");
                sb.append(message);
                return sb.toString();
            default:
                throw new IllegalArgumentException("잘못된 포맷입니다.");
        }
    }
}
