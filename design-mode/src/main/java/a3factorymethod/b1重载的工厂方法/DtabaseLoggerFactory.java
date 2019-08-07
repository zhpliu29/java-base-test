package a3factorymethod.b1重载的工厂方法;

import a3factorymethod.Logger;

public class DtabaseLoggerFactory implements LoggerFactory2 {

    public Logger createLogger() {
        return null;
    }

    public Logger createLogger(String arg) {
        return null;
    }

    public Logger createLogger(Object arg) {
        return null;
    }
}
