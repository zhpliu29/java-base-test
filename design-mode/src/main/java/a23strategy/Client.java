package a23strategy;


public class Client {

    public static void main(String[] args) {

        double originalPrice=60;
        System.out.println("原始价："+originalPrice);
        System.out.println("--------------");

        MovieTicket movieTicket=new MovieTicket();
        movieTicket.setPrice(originalPrice);

        double currentPrice;

        StudentDiscount studentDiscount=new StudentDiscount();
        movieTicket.setDiscount(studentDiscount);
        currentPrice=movieTicket.calculate();
        System.out.println("折后价："+currentPrice);
        System.out.println("--------------");


        ChildernDiscount childernDiscount=new ChildernDiscount();
        movieTicket.setDiscount(childernDiscount);
        currentPrice=movieTicket.calculate();
        System.out.println("折后价："+currentPrice);
        System.out.println("--------------");

        VIPDiscount vipDiscount=new VIPDiscount();
        movieTicket.setDiscount(vipDiscount);
        currentPrice=movieTicket.calculate();
        System.out.println("折后价："+currentPrice);
        System.out.println("--------------");
    }
}
