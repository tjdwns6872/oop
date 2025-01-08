package training.factoryStrategy_3;

public class Execute {
    
    private final TranslateStrategy tStrategy;
    private final LanguageStrategy lStrategy;
    private final MessageHelper message;

    public Execute(TranslateStrategy tStrategy, LanguageStrategy lStrategy){
        this.tStrategy = tStrategy;
        this.lStrategy = lStrategy;
        this.message = MessageHelper.getInstance();
    }

    public void execute(String context, TranslateStrategy tStrategy, LanguageStrategy lStrategy){
        String message = tStrategy.execute(context, lStrategy);
        this.message.printMassage(message);

    }
}
