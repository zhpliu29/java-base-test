package a25observer;

/**
 * 抽象观察类
 */
public interface Observer {

    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(AllyControlCenter acc);
}
