package template;

public abstract class Soymilk {
    public void make() {
        select();
        add();
        soak();
        if (customerWantCondiments()) {
            addCondiments();
        }
        beat();
    }

    public void select() {
        System.out.println("find fresh beans");
    }

    public void add() {
        System.out.println("add fresh beans");
    }

    public void soak() {
        System.out.println("soak fresh beans");
    }

    public void beat() {
        System.out.println("beat fresh beans");
    }

    public abstract void addCondiments();

    // the hook method, default return true
    public boolean customerWantCondiments() {
        return true;
    }
}
