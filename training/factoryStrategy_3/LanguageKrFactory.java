package training.factoryStrategy_3;

public class LanguageKrFactory extends LanguageFactory{

    @Override
    public LanguageStrategy createStrategy() {
        return new LanguageKr();
    }
    
}
