package observer.newWay;

public class FoxWeather implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Today temperature from Fox Weather:" + temperature);
        System.out.println("Today humidity from Fox Weather:" + humidity);
        System.out.println("Today pressure from Fox Weather:" + pressure);
    }
}
