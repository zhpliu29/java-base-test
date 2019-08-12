package a23strategy;

/**
 * 具体策略类：VIP会员折扣类
 */
public class VIPDiscount implements Discount{

    public double calculate(double price){
        System.out.println("VIP");
        return  price*0.2;
    }
}
