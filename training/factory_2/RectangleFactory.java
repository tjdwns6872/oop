package training.factory_2;

public class RectangleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
    
}
