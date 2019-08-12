package a21responsibilitychain;
/**
 * 抽象处理者：审批者类
 */
public abstract class Approver {

    //维护下一个处理者的引用
    protected Approver successor;

    protected String name;

    public Approver(){

    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}
