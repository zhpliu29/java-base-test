package a3factorymethod.b2工厂方法隐藏;

import a3factorymethod.Logger;

/**
 * 抽象工厂
 */
public abstract class LoggerFactory {
    //在公有方法直接提取到抽象工厂
    public void writeLog(){
        Logger logger=this.createLogger();
        logger.writeLog();
    }

    abstract Logger createLogger();
}
