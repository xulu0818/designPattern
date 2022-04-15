package observer.newWay;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
    public void display();
}
