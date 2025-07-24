package newStudyFile.day_10.dto;

public class NotificationRequest {
    private TypeEnum type;
    private boolean isPremium;
    private boolean useAdMessage;
    private boolean useSecurityAlert;
    private boolean useCoupon;

    public TypeEnum getType(){
        return type;
    }
    public boolean getIsPremium(){
        return isPremium;
    }
    public boolean getUseAdMessage(){
        return useAdMessage;
    }
    public boolean getUseSecurityAlert(){
        return useSecurityAlert;
    }
    public boolean getUseCoupon(){
        return useCoupon;
    }

    public NotificationRequest(TypeEnum type
                            ,boolean isPremium
                            ,boolean useAdMessage
                            ,boolean useSecurityAlert
                            ,boolean useCoupon){
        this.type = type;
        this.isPremium = isPremium;
        this.useAdMessage = useAdMessage;
        this.useSecurityAlert = useSecurityAlert;
        this.useCoupon = useCoupon;
    }
}
