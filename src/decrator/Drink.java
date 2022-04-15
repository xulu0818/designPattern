package decrator;

public abstract class Drink {
    private double price = 0.00;
    public String des;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public abstract double cost();
}
