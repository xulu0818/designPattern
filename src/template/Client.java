package template;

public class Client {
    public static void main(String[] args) {
        System.out.println("---one peanut soy milk---");
        Soymilk peanutSoymilk = new PeanutSoymilk();
        peanutSoymilk.make();

        System.out.println("---one red bean soy milk---");
        Soymilk redbeanSoymilk = new RedbeanSoymilk();
        redbeanSoymilk.make();

        System.out.println("---one pure soy milk---");
        Soymilk pureSoymilk = new PureSoymilk();
        pureSoymilk.make();
    }
}
