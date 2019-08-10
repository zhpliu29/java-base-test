package a15facade.before;

/**
 * 子系统：文件写入类
 */
public class FileWriter {

    public void write(String content,String path) {
        System.out.println("内容"+content+"已经写入"+path);
    }
}
