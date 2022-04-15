package bridge;

public class Apple implements Brand {


    @Override
    public void call() {
        System.out.println("apple phone call");
    }

    @Override
    public void open() {
        System.out.println("apple phone open");
    }

    @Override
    public void close() {
        System.out.println("apple phone close");
    }
}
