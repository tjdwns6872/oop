package newStudyFile.day_10.dto;

public class NotificationRequestBuilder {
    private TypeEnum type;
    private boolean isPremium;
    private boolean useAdMessage;
    private boolean useSecurityAlert;
    private boolean useCoupon;

    public NotificationRequestBuilder type(TypeEnum type){
        this.type = type;
        return this;
    }
    public NotificationRequestBuilder isPremium(boolean isPremium){
        this.isPremium = isPremium;
        return this;
    }
    public NotificationRequestBuilder useAdMessage(boolean useAdMessage){
        this.useAdMessage = useAdMessage;
        return this;
    }
    public NotificationRequestBuilder useSecurityAlert(boolean useSecurityAlert){
        this.useSecurityAlert = useSecurityAlert;
        return this;
    }
    public NotificationRequestBuilder useCoupon(boolean useCoupon){
        this.useCoupon = useCoupon;
        return this;
    }
    public NotificationRequest build(){
        return new NotificationRequest(type, isPremium, useAdMessage, useSecurityAlert, useCoupon);
    }
}
