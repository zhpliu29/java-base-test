package a22templatemethod;

public class SavingAccount extends Account {

    @Override
    public void calculateUbterest() {
        System.out.println("按定期利率计算利息");
    }
}
