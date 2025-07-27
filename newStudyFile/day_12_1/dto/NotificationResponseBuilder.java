package newStudyFile.day_12_1.dto;

public class NotificationResponseBuilder {
    
    private String receiver;
    private String resultMessage;
    private String type;

    public NotificationResponseBuilder receiver(String receiver){
        this.receiver = receiver;
        return this;
    }

    public NotificationResponseBuilder resultMessage(String resultMessage){
        this.resultMessage = resultMessage;
        return this;
    }
    public NotificationResponseBuilder type(String type){
        this.type = type;
        return this;
    }

    public NotificationResponse build(){
        return new NotificationResponse(receiver, resultMessage, type);
    }
}
