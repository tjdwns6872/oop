package training.decorator_1;

public class start {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(); // 기본 커피 생성
        coffee = new MilkDecorator(coffee); // 우유 추가

        System.out.println("주문한 커피: " + coffee.getDescription());
        System.out.println("총 가격: " + coffee.getCost());
    }
}
