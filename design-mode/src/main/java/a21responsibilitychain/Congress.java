package a21responsibilitychain;

/**
 * 具体处理类：董事会
 */
public class Congress extends Approver {

    public Congress(String name){
        this.name=name;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会"+name+"审批采购单,金额"+request.getAmount());
    }
}
