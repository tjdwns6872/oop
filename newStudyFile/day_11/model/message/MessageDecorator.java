package newStudyFile.day_11.model.message;

public abstract class MessageDecorator extends Message{
    
    protected Message message;

    public MessageDecorator(Message message){
        this.message = message;
    }
    @Override
    public String getPriority() {
        return message.getPriority();
    }
}
