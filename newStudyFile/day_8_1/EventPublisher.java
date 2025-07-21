package newStudyFile.day_8_1;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher{

    private List<Department> signupList = new ArrayList<>();
    private List<Department> withdrawalList = new ArrayList<>();

    public void subscribe(String type, Department observer){
        if(type.equals("signup")){
            this.signupList.add(observer);
        }else if(type.equals("withdrawal")){
            this.withdrawalList.add(observer);
        }
    }

    public void publish(String type, String user){
        List<Department> list = new ArrayList<>();
        if(type.equals("signup")){
            list = signupList;
        }else if(type.equals("withdrawal")){
            list = withdrawalList;
        }
        for(Department observer: list){
            observer.onEvent(type, user);
        }
    }
}
