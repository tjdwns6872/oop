package training.factoryTemplate_1;

public class PdfTemplate extends DocumentTemplate{

    @Override
    public void header() {
        System.out.println("PDF Header");
    }

    @Override
    public void body() {
        System.out.println("PDF Body");
    }

    @Override
    public void footer() {
        System.out.println("PDF Footer");
    }
    
}
