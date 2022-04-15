package bridge;

public abstract class AbsPhone {
    protected Brand brand;
    public AbsPhone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        this.brand.call();
    }
    public void open(){
        this.brand.open();
    }
    public void close(){
        this.brand.close();
    }
}
