package training.factoryStrategy_3;

public class LanguageEsFactory extends LanguageFactory{

    @Override
    public LanguageStrategy createStrategy() {
        return new LanguageEs();
    }
    
}
