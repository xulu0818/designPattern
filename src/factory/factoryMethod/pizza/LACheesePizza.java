package factory.factoryMethod.pizza;

public class LACheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("LA cheese");
        System.out.println("preparing LA cheese pizza");
    }
}