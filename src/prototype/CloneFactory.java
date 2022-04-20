package prototype;

public class CloneFactory {

    public Animal getClone(Animal newAnimal) {
        return newAnimal.makeCopy();
    }
}
