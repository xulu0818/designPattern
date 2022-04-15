package facade;

public class Stereo {

    private static Stereo stereo = new Stereo();

    private Stereo() {

    }

    public static Stereo getInstance() {
        return stereo;
    }

    public void open() {
        System.out.println("open the stereo");
    }

    public void off() {
        System.out.println("turn the stereo off");
    }

    public void volumeUp() {
        System.out.println("turn the volume up");
    }

    public void volumeDown() {
        System.out.println("turn the volume down");
    }

}
