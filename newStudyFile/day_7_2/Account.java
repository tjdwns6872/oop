package newStudyFile.day_7_2;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject{

    List<Service> service = new ArrayList<>();

    public void addService(Service service){
        this.service.add(service);
    }
    public void removeService(Service service){
        this.service.remove(service);
    }

    public void withdraw(String amount){
        send("withdraw", amount);
    }

    public void deposit(String amount){
        send("deposit", amount);
    }
    @Override
    public void send(String type, String amount) {
        for(Service service: this.service){
            service.send(type, amount);
        }
    }
}
