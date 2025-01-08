package training.factoryStrategy_3;

public class TranslateProvider {
    
    private TranslateEnum type;

    private TranslateFactory factory;

    public TranslateProvider(TranslateEnum type){
        this.type = type;
    }

    public TranslateFactory createFactory(){
        switch (type) {
            case Google:
                this.factory = new GoogleFactory();
                break;
            case Azure:
                this.factory = new AzureFactory();
                break;
            case Manual:
                this.factory = new ManualFactory();
                break;
            default:
                throw new IllegalArgumentException("존재 하지 않는 API입니다.");
        }
        return this.factory;
    }
}
