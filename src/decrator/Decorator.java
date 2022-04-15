package decrator;

public class Decorator extends Drink {

    private Drink deco;

    public Decorator(Drink deco) {
        this.deco = deco;
    }

    @Override
    public double cost() {
        double superPrice = super.getPrice();
        double originCost = deco.cost();// rescurssion
        double total = superPrice + originCost;
        return total;
    }
}
