package newStudyFile.day_12_1.model.template;

import newStudyFile.day_12_1.dto.NotificationResponse;
import newStudyFile.day_12_1.dto.NotificationResponseBuilder;

public abstract class NotificationTemplate {

    protected String type;
    protected String message;
    protected String id;

    public abstract void setting();
    
    public NotificationResponse send(String id, String message){
        setting();
        return new NotificationResponseBuilder()
                .receiver(id)
                .resultMessage(message)
                .type(this.type)
                .build();
    }
}
