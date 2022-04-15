package composition;

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("USC", "top 10");

        OrganizationComponent college = new College("Vertibe", "IT");

        OrganizationComponent computerMajor = new Major("Computer Sceint", "CS");
        OrganizationComponent AIMajor = new Major("AI", "AI");

        college.add(computerMajor);
        college.add(AIMajor);

        university.add(college);
        university.printInfo();

        college.printInfo();


    }
}
