package newStudyFile.day_12_1.dto;

public class NotificationRequestBuilder {
    private String id;

    private String type;

    private String message;

    public NotificationRequestBuilder id(String id){
        this.id = id;
        return this;
    }
    public NotificationRequestBuilder type(String type){
        this.type = type;
        return this;
    }
    public NotificationRequestBuilder message(String message){
        this.message = message;
        return this;
    }
    public NotificationRequest build(){
        return new NotificationRequest(id, type, message);
    }
}
