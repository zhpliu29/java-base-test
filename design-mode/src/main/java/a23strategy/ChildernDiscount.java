package a23strategy;

/**
 * 具体策略类：儿童票折扣类
 */
public class ChildernDiscount implements Discount{

    public double calculate(double price){
        System.out.println("儿童票");
        return  price*0.5;
    }
}
