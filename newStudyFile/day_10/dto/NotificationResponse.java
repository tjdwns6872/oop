package newStudyFile.day_10.dto;

public class NotificationResponse {
    
    private String type;

    private String userType;

    public void setType(String type){
        this.type = type;
    }
    public void setUserType(String userType){
        this.userType = userType;
    }
    public String getType(){
        return this.type;
    }
    public String getUserType(){
        return this.userType;
    }
}
