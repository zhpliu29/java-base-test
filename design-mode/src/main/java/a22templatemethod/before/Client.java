package a22templatemethod.before;

public class Client {

    public static void main(String[] args) {

        Account account=new Account();
        if (account.validate("张无机","123456")){//验证用户
            account.calculateInterest("Current");//计算利息
            account.display();//显示利息
        }else {
            //提示账号或密码出错信息
        }
    }
}
