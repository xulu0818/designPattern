package chainOfResponsibility;

public class Client {
    public static void main(String[] args) {

        RequestPurchase requestPurchase1 = new RequestPurchase(2, 500.00, 1);
        RequestPurchase requestPurchase2 = new RequestPurchase(2, 4000, 2);
        RequestPurchase requestPurchase3 = new RequestPurchase(2, 6000, 3);
        RequestPurchase requestPurchase4 = new RequestPurchase(2, 10000, 4);

        Approver departmentApprover = new DepartmentApprover("department");
        Approver collegeApprover = new CollegeApprover("college");
        Approver vicePresident = new VicePresidentApprover("vice president");
        Approver president = new PresidentApprover("president");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(vicePresident);
        vicePresident.setApprover(president);
        president.setApprover(departmentApprover);

        departmentApprover.processRequest(requestPurchase1);
        departmentApprover.processRequest(requestPurchase2);
        departmentApprover.processRequest(requestPurchase3);
        departmentApprover.processRequest(requestPurchase4);
    }
}
