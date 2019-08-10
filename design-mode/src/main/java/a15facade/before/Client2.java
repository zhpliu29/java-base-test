package a15facade.before;

/**
 * 公文管理系统-使用加密
 */
public class Client2 {

    public static void main(String[] args) {

        //文件读取
        FileReader fileReader=new FileReader();
        //加密类
        CipherMachine cipherMachine=new CipherMachine();
        //文件保存类
        FileWriter fileWriter=new FileWriter();

        String text=fileReader.read("/opt/test.txt");
        String encryptText=cipherMachine.encrypt(text);
        fileWriter.write(encryptText,"/home/lzp/enctypt.txt");

    }
}
