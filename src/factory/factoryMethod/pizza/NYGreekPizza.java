package factory.factoryMethod.pizza;

public class NYGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("NY greek");
        System.out.println("preparing NY greek pizza");
    }
}
