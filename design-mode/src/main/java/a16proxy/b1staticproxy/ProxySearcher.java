package a16proxy.b1staticproxy;

import a16proxy.AccessValidate;
import a16proxy.Logger;
import a16proxy.RealSearcher;
import a16proxy.Searcher;

/**
 * 代理类
 */
public class ProxySearcher implements Searcher {

    private Searcher searcher=new RealSearcher();

    private AccessValidate accessValidate;
    private Logger logger;

    public boolean validate(String userId){
        accessValidate=new AccessValidate();
        return accessValidate.validate(userId);
    }

    public void log(String userId){
        logger=new Logger();
        logger.log(userId);
    }

    public String doSearch(String userId, String keyword) {
        if (validate(userId)){
            String result=searcher.doSearch(userId,keyword);
            this.log(userId);
            return result;
        }else {
            return null;
        }
    }
}
