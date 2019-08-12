package a24state;

/**
 * 具体状态类：正常状态
 */
public class NormalState extends AccountState{

    public NormalState(Account account){
        this.account=account;
    }

    public NormalState(AccountState accountState){
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
        System.out.println("正常状态，无需支付利息！");
    }

    @Override
    public void statCheck() {
        if (account.getBalance()>-2000 && account.getBalance()<=0){
            account.setState(new OverdraftState(this));
        }else if (account.getBalance()== -2000){
            account.setState(new RestrictedState(this));
        }else if (account.getBalance()<-2000){
            //操作受限
            System.out.println("操作受限");
        }
    }
}
