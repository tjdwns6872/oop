package training.command_2;

public class PowerOffCommand implements Command{

    private appliances object;

    public PowerOffCommand(appliances object){
        this.object = object;
    }

    @Override
    public void power() {
        System.out.println(object.getName()+" is now OFF.");
    }
    
}
