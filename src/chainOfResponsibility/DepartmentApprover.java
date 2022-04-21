package chainOfResponsibility;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(RequestPurchase requestPurchase) {
        if (requestPurchase.getPrice() < 3000) {
            System.out.println("department approver will handle this request: " + requestPurchase);
        } else {
            approver.processRequest(requestPurchase);
        }
    }
}
