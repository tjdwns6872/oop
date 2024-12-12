package training.factory_2;

public class CircleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
    
}
