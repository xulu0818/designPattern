package factory.factoryMethod.pizza;

public class NYCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("NY cheese");
        System.out.println("preparing NYcheese pizza");
    }
}
