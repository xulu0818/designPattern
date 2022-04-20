package prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("new sheep is being made");
        Sheep sheepObject = null;

        try {

            sheepObject = (Sheep) super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();

        }
        return sheepObject;
    }
}
