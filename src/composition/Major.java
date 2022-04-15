package composition;

public class Major extends OrganizationComponent {
    public String name;
    public String des;

    public Major(String name, String des) {
        super(name, des);
    }

    public void printInfo() {
        System.out.println("Major:" + getName() + " des:" + getDes());
    }
}
