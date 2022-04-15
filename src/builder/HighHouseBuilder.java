package builder;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void basic() {
        System.out.println("building high house basic");
    }

    @Override
    public void wall() {
        System.out.println("building high house wall");
    }

    @Override
    public void roofed() {
        System.out.println("building high house roofed");
    }
}
