package training.factoryStrategy_3;

public class LanguageProvider {
    
    private LanguageEnum type;

    private LanguageFactory factory;

    public LanguageProvider(LanguageEnum type){
        this.type = type;
    }

    public LanguageFactory getFactory(){
        switch (type) {
            case EN:
                this.factory = new LanguageEnFactory();
                break;
            case ES:
                this.factory = new LanguageEsFactory();
                break;
            case KR:
                this.factory = new LanguageKrFactory();
                break;
            case FR:
                this.factory = new LanguageFrFactory();
                break;
            default:
                throw new IllegalArgumentException("존재하지 않는 언어입니다.");
        }
        return this.factory;
    }


}
