package facade;

public class Screen {

    private static Screen screen = new Screen();

    private Screen(){

    }

    public static Screen getInstance() {
        return screen;
    }

    public void screenUp() {
        System.out.println("put the screen up");
    }

    public void screenDown() {
        System.out.println("put the screen down");
    }
}
