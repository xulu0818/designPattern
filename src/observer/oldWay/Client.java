package observer.oldWay;

/**
 * the traditional way disadvantage:
 * every time we have new third party weather company, we need to change WeatherData, violate ocp
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30, 150, 40);

        System.out.println("weather has changed");
        weatherData.setData(35, 170, 20);
    }
}
