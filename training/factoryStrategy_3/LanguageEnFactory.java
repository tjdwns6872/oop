package training.factoryStrategy_3;

public class LanguageEnFactory extends LanguageFactory{

    @Override
    public LanguageStrategy createStrategy() {
        return new LanguageEn();
    }
    
}
