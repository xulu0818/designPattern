package facade;

public class Projector {

    private static Projector projector = new Projector();

    private Projector(){

    }

    public static Projector getInstance() {
        return projector;
    }

    public void open(){
        System.out.println("open the projector");
    }

    public void close() {
        System.out.println("close the projector");
    }
}
