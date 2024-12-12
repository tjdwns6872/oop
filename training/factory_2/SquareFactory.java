package training.factory_2;

public class SquareFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Square();
    }

    
}