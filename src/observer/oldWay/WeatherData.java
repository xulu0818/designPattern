package observer.oldWay;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange(temperature, humidity, pressure);
    }

    private void dataChange(float temperature, float humidity, float pressure) {
        currentConditions.update(getTemperature(), getHumidity(), getPressure());
    }
}
