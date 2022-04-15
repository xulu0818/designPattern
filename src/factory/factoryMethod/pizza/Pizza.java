package factory.factoryMethod.pizza;

public abstract class Pizza {
    public String name;

    public abstract void prepare();
    public void bake() {
        System.out.println("baking");
    }
    public void cut() {
        System.out.println("cutting");
    }
    public void box() {
        System.out.println("boxing");
    }

    public void setName(String name) {
        this.name = name;
    }


}
