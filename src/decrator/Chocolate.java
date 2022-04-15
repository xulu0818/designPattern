package decrator;

public class Chocolate extends Decorator {
    public Chocolate(Drink originDrink) {
        super(originDrink);
        setDes("chocolate");
        setPrice(1.00);
    }
}
