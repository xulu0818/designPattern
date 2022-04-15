package observer.newWay;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>(); // Aggregation in constructor
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange(temperature, humidity, pressure);
    }

    private void dataChange(float temperature, float humidity, float pressure) {
        //currentConditions.update(getTemperature(), getHumidity(), getPressure());
        notifyObserver();
    }
}
