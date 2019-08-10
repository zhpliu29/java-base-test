package a16proxy;

/**
 * Created by liuzhongpeng on 2019/8/10.
 */
public class RealSearcher implements Searcher {

    public String doSearch(String userId, String keyword) {
        System.out.println(userId+"使用关键词"+keyword+"查询商务信息");
        return "返回具体内容";
    }
}
