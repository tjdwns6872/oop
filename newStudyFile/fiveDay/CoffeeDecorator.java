package newStudyFile.fiveDay;

public abstract class CoffeeDecorator implements Coffee{
    
    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String toString(){
        return getDescription()+", "+getCost()+"원";
    }
}
