package facade;

public class Light {

    private static Light light = new Light();// early initialization

    private Light() {

    }

    public static Light getInstance() {
        return light;
    }

    public void lighter() {
        System.out.println("make more light");
    }

    public void dim() {
        System.out.println("dim the light");
    }
}
