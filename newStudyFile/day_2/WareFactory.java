package newStudyFile.day_2;

public class WareFactory {
    
    public Ware makeWareFactory(String ware){
        switch (ware) {
            case "Food":
                return new Food();
            case "Book":
                return new Book();
            case "Electronics":
                return new Electronics();
            default:
                throw new IllegalArgumentException("존재하지 않는 상품입니다.");
        }
    }
}
