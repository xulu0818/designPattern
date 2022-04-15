package builder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void basic() {
        System.out.println("building common house basic");
    }

    @Override
    public void wall() {
        System.out.println("building common house wall");
    }

    @Override
    public void roofed() {
        System.out.println("building common house roofed");
    }
}
