package a16proxy.b1staticproxy;

import a16proxy.Searcher;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        Searcher searcher=new ProxySearcher();
        searcher.doSearch("杨过","小龙女");
    }
}
