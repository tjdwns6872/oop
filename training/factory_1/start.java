package training.factory_1;

public class start {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.getFactory("dog");
        Animal cat = factory.getFactory("cat");

        dog.speak();
        cat.speak();
    }
}
