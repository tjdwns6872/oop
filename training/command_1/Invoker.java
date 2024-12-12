package training.command_1;

public class Invoker {

    private Command command;
    
    public void setCommand(Command comm){
        this.command = comm;
    }

    public void executeCommand(){
        command.executeCommand();
    }
}
