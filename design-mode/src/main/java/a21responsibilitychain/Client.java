package a21responsibilitychain;
public class Client {

    public static void main(String[] args) {

        PurchaseRequest request=new PurchaseRequest(1200003.5);

        Approver director=new Director("尹天仇");
        Approver vicePresident=new VicePresident("小水滴");
        Approver president=new President("老天");
        Approver congress=new Congress("一个碗");

        //客户端构建责任链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
//        president.setSuccessor(director);//设置不当会引起死循环
        president.setSuccessor(congress);

        //上述设置责任链可以进行改进，set方法返回当前被设置的Approver，使用以下方式优雅的设置
//        director.setSuccessor(vicePresident).
//                setSuccessor(president).setSuccessor(congress);

        //处理请求
        director.processRequest(request);




    }
}
