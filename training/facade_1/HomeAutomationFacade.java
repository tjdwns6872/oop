package training.facade_1;

public class HomeAutomationFacade {

    private MusicSystem musicSystem;
    private LightingSystem lightingSystem;
    private TemperatureSystem temperatureSystem;

    public HomeAutomationFacade(){
        this.musicSystem = new MusicSystem();
        this.lightingSystem = new LightingSystem();
        this.temperatureSystem = new TemperatureSystem();
    }

    public void startEveningRoutine(){
        musicSystem.start();
        lightingSystem.start();
        temperatureSystem.start();
    }

    public void stopEveningRoutine(){
        musicSystem.stop();
        lightingSystem.stop();
        temperatureSystem.stop();
    }
}
