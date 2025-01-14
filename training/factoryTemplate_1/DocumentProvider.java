package training.factoryTemplate_1;

public class DocumentProvider {
    
    public static DocumentFactory getDocumentFactory(DocumentEnum type){
        switch (type) {
            case PDF:
                return new PdfFactory();
            case HTML:
                return new HtmlFactory();
            default:
                throw new IllegalArgumentException("잘못된 형식");
        }
    }
}
