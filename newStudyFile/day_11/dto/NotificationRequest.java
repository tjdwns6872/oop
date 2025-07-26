package newStudyFile.day_11.dto;

public class NotificationRequest {
    private String message;
    private boolean premium;
    private boolean useHeader;
    private boolean useFooter;

    public NotificationRequest(String message
                                , boolean premium
                                , boolean useHeader
                                , boolean useFooter){
        this.message = message;
        this.premium = premium;
        this.useHeader = useHeader;
        this.useFooter = useFooter;
    }

    public String getMessage(){
        return this.message;
    }
    public boolean getPremium(){
        return this.premium;
    }
    public boolean getUseHeader(){
        return this.useHeader;
    }
    public boolean getUseFooter(){
        return this.useFooter;
    }
}
