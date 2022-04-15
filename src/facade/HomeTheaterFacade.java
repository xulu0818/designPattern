package facade;

public class HomeTheaterFacade {

    private DVPlayer dvPlayer;
    private Light light;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.dvPlayer = DVPlayer.getInstance();
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        dvPlayer.open();
        light.dim();
        popcorn.makePopcorn();
        projector.open();
        screen.screenDown();
        stereo.open();
    }

    public void play() {
        dvPlayer.play();
        stereo.volumeUp();
    }

    public void turnOff() {
        dvPlayer.close();
        stereo.volumeDown();
        popcorn.closePopMachine();
        light.lighter();
        projector.close();
        screen.screenUp();
    }
}
