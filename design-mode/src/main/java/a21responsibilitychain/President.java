package a21responsibilitychain;

/**
 * 具体处理类：董事长类
 */
public class President extends Approver {

    public President(String name){
        this.name=name;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000){
            System.out.println("董事长"+name+"审批采购单,金额"+request.getAmount());
        }else {
            this.successor.processRequest(request);
        }
    }
}
