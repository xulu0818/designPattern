package decrator;

public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }
}
