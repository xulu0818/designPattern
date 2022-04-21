package chainOfResponsibility;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(RequestPurchase requestPurchase) {
        if (requestPurchase.getPrice() >= 3000 && requestPurchase.getPrice() < 5000) {
            System.out.println("college approver will handle this request: " + requestPurchase);
        } else {
            approver.processRequest(requestPurchase);
        }
    }
}
