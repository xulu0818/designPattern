package observer.newWay;

/**
 * Observer pattern advantage:
 * every time we have new third party weather company, we don't need to change WeatherData
 * we can directly register new observer, and use it
 */
public class Client {
    public static void main(String[] args) {
        Observer currentConditions = new CurrentConditions();
        Observer foxWeather = new FoxWeather();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(foxWeather);
        weatherData.setData(30, 150, 40);

        System.out.println("weather has changed");
        weatherData.setData(35, 170, 20);
    }
}
