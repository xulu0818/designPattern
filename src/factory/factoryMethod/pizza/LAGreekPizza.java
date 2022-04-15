package factory.factoryMethod.pizza;

public class LAGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("LA greek");
        System.out.println("preparing LA greek pizza");
    }
}