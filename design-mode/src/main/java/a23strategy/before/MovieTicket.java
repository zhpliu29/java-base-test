package a23strategy.before;

public class MovieTicket {

    private double price;
    private String type;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public double calculate(){
        if (type.equalsIgnoreCase("student")){
            //优惠算法1
            System.out.println("学生票");
            return price*0.8;
        }else if (type.equalsIgnoreCase("children") && price>=20){
            //优惠算法2
            System.out.println("儿童票");
            return price-10;
        }else if (type.equalsIgnoreCase("vip")){
            //优惠算法3
            System.out.println("VIP");
            System.out.println("增加集分");
            return price*0.5;
        }else {
            //优惠算法4
            return price*0.8;
        }
    }
}
