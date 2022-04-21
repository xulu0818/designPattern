package chainOfResponsibility;

public class VicePresidentApprover extends Approver {


    public VicePresidentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(RequestPurchase requestPurchase) {
        if (requestPurchase.getPrice() >= 5000 &&  requestPurchase.getPrice() < 8000) {
            System.out.println("vice president will handle this request: " + requestPurchase);
        } else {
            approver.processRequest(requestPurchase);
        }
    }
}
