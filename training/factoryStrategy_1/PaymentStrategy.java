package training.factoryStrategy_1;

public interface PaymentStrategy {

    public void pay(double price);

    public boolean effectivenessCheck();

    public TypeEnum getType();
}