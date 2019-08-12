package a24state;

/**
 * 抽象状态类
 */
public abstract class AccountState {

    protected Account account;
    //存款
    public abstract void deposite(double amount);
    //取款
    public abstract void withdraw(double amount);
    //计算利息
    public abstract void computeInterest();
    //状态检查和转换操作
    public abstract void statCheck();
}
