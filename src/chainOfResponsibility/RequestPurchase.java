package chainOfResponsibility;

public class RequestPurchase {

    private int number;
    private double price;
    private int id;

    public RequestPurchase(int number, double price, int id) {
        this.number = number;
        this.price = price;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "RequestPurchase{" +
                "number=" + number +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
