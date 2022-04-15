package template;

public class PureSoymilk extends Soymilk {
    @Override
    public void addCondiments() {
        // empty implementation
    }

    public boolean customerWantCondiments() {
        return false;
    }
}
