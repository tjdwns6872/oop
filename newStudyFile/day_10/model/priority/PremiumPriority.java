package newStudyFile.day_10.model.priority;

public class PremiumPriority implements PriorityStrategy{

    @Override
    public String getPriority() {
        return "[유료 회원]";
    }
    
}
