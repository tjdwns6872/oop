package newStudyFile.day_11.dto;

public class NotificationResponseBuilder {
    private String message;
    private String type;

    public NotificationResponseBuilder message(String message){
        this.message = message;
        return this;
    }
    public NotificationResponseBuilder type(String type){
        this.type = type;
        return this;
    }
    public NotificationResponse build(){
        return new NotificationResponse(message, type);
    }
}
