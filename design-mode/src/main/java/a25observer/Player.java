package a25observer;

/**
 * 具体观察者类：战队成员类
 */
public class Player implements Observer {

    private String name;

    public Player(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void help() {
        System.out.println("坚持住"+this.name+"来救你！");
    }

    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name+"被攻击");
        acc.notifyObserver(name);
    }
}
