package a23strategy.before;

public class Client {

    public static void main(String[] args) {

        MovieTicket movieTicket=new MovieTicket();

        double originalPrice=60;
        double currentPrice;

        movieTicket.setPrice(originalPrice);
        System.out.println("原始价："+originalPrice);
        System.out.println("--------------");

        movieTicket.setType("student");
        currentPrice=movieTicket.calculate();
        System.out.println("折后价："+currentPrice);
        System.out.println("--------------");

        movieTicket.setType("children");
        currentPrice=movieTicket.calculate();
        System.out.println("折后价："+currentPrice);
        System.out.println("--------------");
    }
}
