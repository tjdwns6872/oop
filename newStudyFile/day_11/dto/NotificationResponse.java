package newStudyFile.day_11.dto;

public class NotificationResponse {
    private String message;
    private String type;

    public NotificationResponse(String message, String type){
        this.message = message;
        this.type = type;
    }

    public String getMessage(){
        return this.message;
    }
    public String getType(){
        return this.type;
    }
}
