package newStudyFile.day_6;

public abstract class ConverterDecorator implements DocumentConverter{

    protected final DocumentConverter converter;

    public ConverterDecorator(DocumentConverter converter){
        this.converter = converter;
    }

}
