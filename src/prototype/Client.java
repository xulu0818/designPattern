package prototype;

/**
 * 1. creating new objects by cloning other objects
 * 2. Allows for adding of any subclass instance of a known super
 *    class at run time
 * 3. Reduces the need for creating subclasses
 */
public class Client {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();

        Sheep dolly = (Sheep) animalMaker.getClone(sally);

        System.out.println("sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("dolly HashCode: " + System.identityHashCode(System.identityHashCode(dolly)));
    }
}
