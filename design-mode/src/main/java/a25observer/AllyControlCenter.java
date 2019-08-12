package a25observer;

import java.util.ArrayList;

/**
 * 目标类：战队控制中心
 */
public abstract class AllyControlCenter {

    protected String allyName;
    protected ArrayList<Observer> players=new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    //注册方法
    public void join(Observer observer){
        System.out.println(observer.getName()+"加入"+this.allyName+"战队");
        players.add(observer);
    }

    //注销方法
    public void quit(Observer observer){
        System.out.println(observer.getName()+"退出"+this.allyName+"战队");
        players.remove(observer);
    }

    //通知方法
    public abstract void notifyObserver(String name);
}
