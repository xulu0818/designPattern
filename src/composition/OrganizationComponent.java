package composition;

public abstract class OrganizationComponent {
    public String name;
    public String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public void add(OrganizationComponent organizationComponent) {
        // default add method
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent college) {
        throw new UnsupportedOperationException();
    }

    public abstract void printInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
