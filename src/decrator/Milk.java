package decrator;

public class Milk extends Decorator {

    public Milk(Drink deco) {
        super(deco);
        setDes("milk");
        setPrice(2.00);
    }
}
