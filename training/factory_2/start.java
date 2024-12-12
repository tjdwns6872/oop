package training.factory_2;

public class start {
    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        Shape circle = circleFactory.createShape();
        Shape square = squareFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
