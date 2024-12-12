package training.factory_1;

public class AnimalFactory {

    public Animal getFactory(String type){
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown animal type: " + type);
    }
}
