package facade;

public class Popcorn {

    private static Popcorn popcorn = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        return popcorn;
    }

    public void makePopcorn() {
        System.out.println("making popcorn");
    }
    
    public void closePopMachine() {
        System.out.println("close pop machine");
    }
}
