package a24state;

/**
 * 具体状态类：透支状态
 */
public class OverdraftState extends AccountState{

    public OverdraftState(Account account){
        this.account=account;
    }

    public OverdraftState(AccountState accountState){
        this.account=accountState.account;
    }

    @Override
    public void deposite(double amount) {
        account.setBalance(account.getBalance()+amount);
        statCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance()-amount);
        statCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void statCheck() {
        if (account.getBalance()>0){
            account.setState(new NormalState(this));
        }else if (account.getBalance()== -2000){
            account.setState(new RestrictedState(this));
        }else if (account.getBalance()<-2000){
            //操作受限
            System.out.println("操作受限");
        }
    }
}
