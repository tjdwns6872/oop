package training.factoryStrategy_3;

public class ManualTranslate implements TranslateStrategy{

    @Override
    public TranslateEnum getEnum() {
        return TranslateEnum.Manual;
    }
    
    @Override
    public String execute(String context, LanguageStrategy langType) {
        return context + " 번역 결과: " + langType.getLangEnum().getName();
    }
}
