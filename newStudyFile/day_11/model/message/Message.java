package newStudyFile.day_11.model.message;

import newStudyFile.day_11.model.priority.BasicPriority;
import newStudyFile.day_11.model.priority.PremiumPriority;
import newStudyFile.day_11.model.priority.PriorityStrategy;

public abstract class Message {
    protected PriorityStrategy priorityStrategy;
    private String str;
    private String type;

    public void setPriority(boolean isPremium){
        if(isPremium){
            this.priorityStrategy = new PremiumPriority();
        }else{
            this.priorityStrategy = new BasicPriority();
        }
        this.type = this.priorityStrategy.getType();
    }
    public void setStr(String str){
        this.str = str;
    }
    public String getPriority(){
        return this.type;
    }
    public String getStr(){
        return this.str;
    }

    public abstract String getMessage();

}
