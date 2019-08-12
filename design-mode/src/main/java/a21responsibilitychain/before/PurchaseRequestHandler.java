package a21responsibilitychain.before;

import a21responsibilitychain.PurchaseRequest;

/**
 * 采购单处理类
 */
public class PurchaseRequestHandler {

    //审批
    public void sendRequestToDirector(PurchaseRequest request){
        if (request.getAmount()<50000){
            this.handleByDirector(request);
        }else if (request.getAmount()<100000){
            this.handleByVicePresident(request);
        }else if (request.getAmount()<500000){
            this.handleByPresident(request);
        }else {
            this.handleByCongress(request);
        }
    }
    //主任审批
    private void handleByDirector(PurchaseRequest request){
        System.out.println("主任审批采购单,金额"+request.getAmount());
    }
    //副董事长审批
    private void handleByVicePresident(PurchaseRequest request){
        System.out.println("副董事长审批采购单,金额"+request.getAmount());
    }
    //董事长审批
    private void handleByPresident(PurchaseRequest request){
        System.out.println("董事长审批采购单,金额"+request.getAmount());
    }
    //董事会审批
    private void handleByCongress(PurchaseRequest request){
        System.out.println("董事会审批采购单,金额"+request.getAmount());
    }
}
