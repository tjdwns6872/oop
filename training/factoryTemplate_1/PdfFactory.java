package training.factoryTemplate_1;

public class PdfFactory extends DocumentFactory{

    @Override
    public void execute() {
        DocumentTemplate template = new PdfTemplate();
        template.execude();
    }
    
}
