package a24state;

public class Account {

    private AccountState state;//维持抽象状态对象的引用
    private String owner;//开户名
    private double balance=0;//账户余额

    public Account(String owner,double init){
        this.owner=owner;
        this.balance=init;
        this.state=new NormalState(this);
        System.out.println(owner+"开户，初始金额为"+init);
        System.out.println("-------------------------");
    }

    public void deposit(double amount){
        System.out.println(owner+"存款"+amount);
        state.deposite(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state);
        System.out.println("-------------------------");
    }

    public void withdraw(double amount){
        System.out.println(owner+"取款"+amount);
        state.withdraw(amount);
        System.out.println("现在余额为："+this.balance);
        System.out.println("现在账户状态为："+this.state);
        System.out.println("-------------------------");
    }

    public void computeInterest(){
       state.computeInterest();
    }


    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
