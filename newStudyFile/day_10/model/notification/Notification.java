package newStudyFile.day_10.model.notification;

import newStudyFile.day_10.model.priority.BasicPriority;
import newStudyFile.day_10.model.priority.PremiumPriority;
import newStudyFile.day_10.model.priority.PriorityStrategy;

public abstract class Notification {
    
    protected PriorityStrategy priorityStrategy;

    public void setPriority(boolean isPremium){
        if(isPremium){
            this.priorityStrategy = new PremiumPriority();
        }else{
            this.priorityStrategy = new BasicPriority();
        }
    }

    public String getPriority(){
        return this.priorityStrategy.getPriority();
    }

    public abstract String getNotification();
}
