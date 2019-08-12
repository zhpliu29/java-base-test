package a24state;

/**
 * 具体状态类：受限状态
 */
public class RestrictedState extends AccountState{

    public RestrictedState(Account account){
        this.account=account;
    }

    public RestrictedState(AccountState accountState){
        this.account=accountState.account;
    }

    @Override
    public void deposite(double amount) {
        account.setBalance(account.getBalance()+amount);
        statCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void statCheck() {
        if (account.getBalance()>0){
            account.setState(new NormalState(this));
        }else if (account.getBalance()> -2000){
            account.setState(new OverdraftState(this));
        }
    }
}
