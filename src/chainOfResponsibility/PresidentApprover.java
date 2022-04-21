package chainOfResponsibility;

public class PresidentApprover extends Approver{

    public PresidentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(RequestPurchase requestPurchase) {
        if (requestPurchase.getPrice() >= 8000) {
            System.out.println("president will handle this request: " + requestPurchase);
        } else {
            approver.processRequest(requestPurchase);
        }
    }
}
