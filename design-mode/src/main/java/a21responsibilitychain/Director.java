package a21responsibilitychain;

/**
 * 具体处理类：主任类
 */
public class Director extends Approver {

    public Director(String name){
        this.name=name;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000){
            System.out.println("主任"+name+"审批采购单,金额"+request.getAmount());
        }else {
            this.successor.processRequest(request);
        }
    }
}
