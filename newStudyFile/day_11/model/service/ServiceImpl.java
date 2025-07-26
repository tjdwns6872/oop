package newStudyFile.day_11.model.service;

import newStudyFile.day_11.dto.NotificationRequest;
import newStudyFile.day_11.dto.NotificationResponse;
import newStudyFile.day_11.dto.NotificationResponseBuilder;
import newStudyFile.day_11.model.message.FooterDecorator;
import newStudyFile.day_11.model.message.HeaderDecorator;
import newStudyFile.day_11.model.message.Message;
import newStudyFile.day_11.model.message.PlainMessage;

public class ServiceImpl implements Service{
    public NotificationResponse MessageSystem(NotificationRequest request){
        Message message = new PlainMessage();
        message.setPriority(request.getPremium());
        message.setStr(request.getMessage());
        if(request.getUseHeader()){
            message = new HeaderDecorator(message);
        }
        if(request.getUseFooter()){
            message = new FooterDecorator(message);
        }
        NotificationResponse response = new NotificationResponseBuilder()
                                            .type(message.getPriority())
                                            .message(message.getMessage())
                                            .build();
        return response;
    }
}
