package bridge;

public class FlipPhone extends AbsPhone{
    public FlipPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("FlipPhone call");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("FlipPhone open");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("FlipPhone close");
    }
}
