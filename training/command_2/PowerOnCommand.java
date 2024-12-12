package training.command_2;


public class PowerOnCommand implements Command{

    private appliances object;

    public PowerOnCommand(appliances object){
        this.object = object;
    }

    @Override
    public void power() {
        System.out.println(object.getName()+" is now ON.");
    }
}
