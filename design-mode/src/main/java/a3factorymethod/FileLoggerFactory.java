package a3factorymethod;

public class FileLoggerFactory implements LoggerFactory{
    public Logger createLogger() {
        //连接数据库
        //..
        Logger logger=new FileLogger();
        //..
        return logger;
    }
}
