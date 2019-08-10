package a15facade;

/**
 * 财务管理系统-使用加密
 */
public class Client1 {

    public static void main(String[] args) {

       String pathSrc="/opt/test.txt";
       String pathDes="/opt/encrypt.txt";

       EncryptFacade encryptFacade=new EncryptFacade();
       encryptFacade.fileEncrypt(pathSrc,pathDes);

    }
}
