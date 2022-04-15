package builder;

// Builder focuses on constructing a complex object step by step.
// Abstract Factory emphasizes a family of product objects (either simple or complex).
// Builder returns the product as a final step,
// but as far as the Abstract Factory is concerned, the product gets returned immediately. Builder often builds a Composite.
public abstract class HouseBuilder {
    House house = new House();
    public abstract void basic();
    public abstract void wall();
    public abstract void roofed();

    public House build() {
        return house;
    }
}
// Builder
//class FruitBuilder {
//    String name, color, firmness;
//    FruitBuilder setName(name)         { this.name     = name;     return this; }
//    FruitBuilder setColor(color)       { this.color    = color;    return this; }
//    FruitBuilder setFirmness(firmness) { this.firmness = firmness; return this; }
//    Fruit build() {
//        return new Fruit(this); // Pass in the builder
//    }
//}
//
//    // Usage
//    Fruit fruit = new FruitBuilder()
//            .setName("apple")
//            .setColor("red")
//            .setFirmness("crunchy")
//            .build();
// }