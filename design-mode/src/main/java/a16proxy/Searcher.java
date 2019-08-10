package a16proxy;

/**
 * 抽象主题：抽象查询类
 */
public interface Searcher {
    String doSearch(String userId,String keyword);
}
