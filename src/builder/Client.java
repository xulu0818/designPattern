package builder;

public class Client {

    public static void main(String[] args) {
        BuilderDirector builderDirector = new BuilderDirector(new HighHouseBuilder());
        builderDirector.concreteHouse();

        System.out.println("==================");
        BuilderDirector builderDirector2 = new BuilderDirector(new CommonHouseBuilder());
        builderDirector2.concreteHouse();
    }
}
