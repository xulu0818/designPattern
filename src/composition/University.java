package composition;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
    public String name;
    public String des;

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent college) {
        organizationComponents.add(college);
    }

    @Override
    public void remove(OrganizationComponent college) {
        organizationComponents.remove(college);
    }

    public void printInfo() {
        System.out.println("University: " + getName() + " des:" + getDes());
        for (OrganizationComponent college : organizationComponents) {
            System.out.println("college: " + college.getName() + " des:" + college.getDes());
        }
    }
}
