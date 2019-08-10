package a15facade;

import a15facade.before.CipherMachine;
import a15facade.before.FileReader;
import a15facade.before.FileWriter;

/**
 * 公文管理系统-使用加密
 */
public class Client2 {

    public static void main(String[] args) {

        String pathSrc="/opt/test.txt";
        String pathDes="/opt/encrypt.txt";

        EncryptFacade encryptFacade=new EncryptFacade();
        encryptFacade.fileEncrypt(pathSrc,pathDes);

    }
}
