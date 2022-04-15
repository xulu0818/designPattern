package facade;

public class DVPlayer {

    private static final DVPlayer dvPlayer = new DVPlayer();

    private DVPlayer(){

    }

    public static DVPlayer getInstance() {
        return dvPlayer;
    }

    public void open() {
        System.out.println("open DVPlayer");
    }

    public void play() {
        System.out.println("playing DVD");
    }

    public void pause() {
        System.out.println("pause the DVD");
    }

    public void close() {
        System.out.println("close the DVPlayer");
    }
}
