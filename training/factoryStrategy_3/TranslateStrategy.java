package training.factoryStrategy_3;

public interface TranslateStrategy {
    
    public TranslateEnum getEnum();

    public String execute(String context, LanguageStrategy langType);
}
