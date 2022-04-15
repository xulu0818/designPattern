package composition;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    public String name;
    public String des;

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent major) {
        organizationComponents.add(major);
    }

    @Override
    public void remove(OrganizationComponent major) {
        organizationComponents.remove(major);
    }

    public void printInfo() {
        System.out.println("College: " + getName() + " des:" + getDes());
        for (OrganizationComponent major : organizationComponents) {
            System.out.println("major: " + major.getName() + " des:" + major.getDes());
        }
    }
}
