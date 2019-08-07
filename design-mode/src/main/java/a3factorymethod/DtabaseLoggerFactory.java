package a3factorymethod;

public class DtabaseLoggerFactory implements LoggerFactory{
    public Logger createLogger() {
        //连接数据库
        //..
        Logger logger=new DatabaseLogger();
        //..
        return logger;
    }
}
