package a16proxy.b2dynamicproxy;

import a16proxy.RealSearcher;
import a16proxy.Searcher;

import java.lang.reflect.Proxy;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        Searcher searcher=new RealSearcher();
        Searcher proxy= (Searcher) Proxy.newProxyInstance(Searcher.class.getClassLoader(),
                new Class[]{Searcher.class},new LoggerHandler(searcher));
        proxy.doSearch("杨过","小龙女");
    }
}
