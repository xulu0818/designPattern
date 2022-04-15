package builder;

public class BuilderDirector {
    HouseBuilder houseBuilder;

    public BuilderDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
//    public void setHouseBuilder(HouseBuilder houseBuilder) {
//        this.houseBuilder = houseBuilder;
//    }
    public House concreteHouse() {
        houseBuilder.basic();
        houseBuilder.wall();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
