package a1singleton;

/**
 * 静态内部类的方式
 */
public class Singleton {

    private Singleton(){

    }

    private static class HolderClass{
        private static Singleton instance=new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

}
