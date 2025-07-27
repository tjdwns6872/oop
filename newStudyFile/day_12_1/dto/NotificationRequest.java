package newStudyFile.day_12_1.dto;

public class NotificationRequest {
    
    private String id;

    private String type;

    private String message;

    public String getId(){
        return this.id;
    }
    public String getType(){
        return this.type;
    }
    public String getMessage(){
        return this.message;
    }

    public NotificationRequest(String id, String type, String message){
        this.id = id;
        this.type = type;
        this.message = message;
    }
}
