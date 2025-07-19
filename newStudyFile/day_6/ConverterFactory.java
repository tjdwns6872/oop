package newStudyFile.day_6;

public class ConverterFactory {
    
    public static DocumentConverter getConverter(String type){
        switch (type) {
            case "PDF":
                return new PdfConverter();
            case "HTML":
                return new HtmlConverter();
            case "Markdown":
                return new MarkdownConverter();
            default:
                throw new IllegalArgumentException("존재하지 않는 변환 방법입니다.");
        }
    }
}
