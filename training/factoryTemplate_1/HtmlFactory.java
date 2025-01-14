package training.factoryTemplate_1;

public class HtmlFactory extends DocumentFactory{

    @Override
    public void execute() {
        DocumentTemplate template = new HtmlTemplate();
        template.execude();
    }
    
}
