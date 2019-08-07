package a3factorymethod;

public class Client {

    public static void main(String[] args) {
        LoggerFactory loggerFactory=new FileLoggerFactory();
        Logger logger=loggerFactory.createLogger();
        logger.writeLog();
    }
}
