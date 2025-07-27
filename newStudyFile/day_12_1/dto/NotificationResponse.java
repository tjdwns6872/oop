package newStudyFile.day_12_1.dto;

public class NotificationResponse {

    private String receiver;
    private String resultMessage;
    private String type;

    public NotificationResponse(String receiver, String resultMessage, String type) {
        this.receiver = receiver;
        this.resultMessage = resultMessage;
        this.type = type;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getResultMessage() {
        return resultMessage;
    }
    public String getType(){
        return type;
    }

}