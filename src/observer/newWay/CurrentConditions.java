package observer.newWay;

/**
 * A third party temperature system ==> an observer
 */
public class CurrentConditions implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Push pattern: the update() is called by WeatherData.
     * if there is any changes for the current weather, the WeatherData will call this method
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Today temperature:" + temperature);
        System.out.println("Today humidity:" + humidity);
        System.out.println("Today pressure:" + pressure);
    }

}
