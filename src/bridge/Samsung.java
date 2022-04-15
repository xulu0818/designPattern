package bridge;

public class Samsung implements Brand{
    @Override
    public void call() {
        System.out.println("Samsung phone call");
    }

    @Override
    public void open() {
        System.out.println("Samsung phone open");
    }

    @Override
    public void close() {
        System.out.println("Samsung phone close");
    }
}
