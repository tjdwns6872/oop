package training.factoryTemplate_1;

public class start {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = DocumentProvider.getDocumentFactory(DocumentEnum.PDF);
        pdfFactory.execute();

        DocumentFactory htmlFactory = DocumentProvider.getDocumentFactory(DocumentEnum.HTML);
        htmlFactory.execute();
    }
}
