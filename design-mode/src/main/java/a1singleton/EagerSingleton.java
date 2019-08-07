package a1singleton;

/**
 * 饿汉式
 */
public class EagerSingleton {

    private static EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton gerInstance(){
        return instance;
    }
}
