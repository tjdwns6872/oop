package training.command_2;

public class RemoteControl {

    private Command command;
    
    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.power();
    }
}
