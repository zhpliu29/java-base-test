package a3factorymethod.b1重载的工厂方法;

import a3factorymethod.Logger;

/**
 * 抽象工厂，定义多个重载的方法，以不同方式对产品对象进行创建，但是创建的产品类型均相同
 */
public interface LoggerFactory2 {
    Logger createLogger();
    Logger createLogger(String arg);
    Logger createLogger(Object arg);
}
