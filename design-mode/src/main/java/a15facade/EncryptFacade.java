package a15facade;

import a15facade.before.CipherMachine;
import a15facade.before.FileReader;
import a15facade.before.FileWriter;

/**
 * 外观角色：加密外观类
 */
public class EncryptFacade {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;

    public EncryptFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.cipherMachine = new CipherMachine();
    }

    public void fileEncrypt(String pathSrc,String pathDes){
        String text=fileReader.read(pathSrc);
        String encryptText=cipherMachine.encrypt(text);
        fileWriter.write(encryptText,pathDes);
    }
}
