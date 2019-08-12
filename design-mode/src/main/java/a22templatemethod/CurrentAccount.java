package a22templatemethod;

public class CurrentAccount extends Account {

    @Override
    public void calculateUbterest() {
        System.out.println("按活期利率计算利息");
    }
}
