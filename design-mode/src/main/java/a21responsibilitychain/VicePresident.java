package a21responsibilitychain;

/**
 * 具体处理类：副董事长
 */
public class VicePresident extends Approver {

    public VicePresident(String name){
        this.name=name;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000){
            System.out.println("副董事长"+name+"审批采购单,金额"+request.getAmount());
        }else {
            this.successor.processRequest(request);
        }
    }
}
