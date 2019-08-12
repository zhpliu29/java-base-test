package a23strategy;

/**
 * 环境类
 */
public class MovieTicket {

    private double price;

    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public double calculate(){
        return discount.calculate(price);
    }
}
