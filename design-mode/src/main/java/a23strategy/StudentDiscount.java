package a23strategy;

/**
 * 具体策略类：学生票折扣类
 */
public class StudentDiscount implements Discount{

    public double calculate(double price){
        System.out.println("学生票");
        return  price*0.8;
    }
}
