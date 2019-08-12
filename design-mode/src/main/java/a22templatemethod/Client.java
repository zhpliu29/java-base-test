package a22templatemethod;

public class Client {

    public static void main(String[] args) {

        Account account=new CurrentAccount();
        account.handle("张无机","123456");
    }
}
