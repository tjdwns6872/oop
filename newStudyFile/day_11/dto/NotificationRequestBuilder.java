package newStudyFile.day_11.dto;

public class NotificationRequestBuilder {
    private String message;
    private boolean premium;
    private boolean useHeader;
    private boolean useFooter;

    public NotificationRequestBuilder message(String message){
        this.message = message;
        return this;
    }
    public NotificationRequestBuilder premium(boolean premium){
        this.premium = premium;
        return this;
    }
    public NotificationRequestBuilder useHeader(boolean useHeader){
        this.useHeader = useHeader;
        return this;
    }
    public NotificationRequestBuilder useFooter(boolean useFooter){
        this.useFooter = useFooter;
        return this;
    }
    public NotificationRequest build(){
        return new NotificationRequest(message, premium, useHeader, useFooter);
    } 
}
