package newStudyFile.oneDay.Factory1;

public class FoodFactory {
    
    public Food makeFood(String food){
        if("Pizza".equals(food)){
            return new Pizza();
        }else if("Chicken".equals(food)){
            return new Chicken();
        }else if("Burger".equals(food)){
            return new Burger();
        }else{
            throw new IllegalArgumentException("존재하지 않는 음식입니다. >"+food);
        }
    }
}
