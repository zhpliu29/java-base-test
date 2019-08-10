package a16proxy.b2dynamicproxy;

import a16proxy.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理：添加了log
 */
public class LoggerHandler implements InvocationHandler {

    private Object object;//被代理的对象

    private Logger logger;

    public LoggerHandler(Object object){
        this.object=object;
    }

    public void log(String userId){
        logger=new Logger();
        logger.log(userId);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.log((String)args[0]+"======invoke before======");
        Object result=method.invoke(object,args);
        this.log((String)args[0]+"======invoke after======");
        return result;
    }
}
