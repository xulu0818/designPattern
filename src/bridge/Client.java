package bridge;

public class Client {
    public static void main(String[] args) {
        AbsPhone phone = new FlipPhone(new Apple());
        phone.call();
        phone.open();
        phone.close();
    }
}
