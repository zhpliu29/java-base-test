package a25observer;

public class Client {

    public static void main(String[] args) {

        AllyControlCenter allyControlCenter=new ConcreteAllyControlCenter("金庸群侠");

        Observer observer1=new Player("杨过");
        Observer observer2=new Player("令狐冲");
        Observer observer3=new Player("张无机");
        Observer observer4=new Player("段誉");

        allyControlCenter.join(observer1);
        allyControlCenter.join(observer2);
        allyControlCenter.join(observer3);
        allyControlCenter.join(observer4);

        observer1.beAttacked(allyControlCenter);

    }
}
