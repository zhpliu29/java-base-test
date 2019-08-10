package a13composite.before;

/**
 * 图像文件类
 */
public class TextFile {

    private String name;

    public TextFile(String name){
        this.name=name;
    }

    public void killVirus(){
        System.out.println("对文本文件-"+name+"-进行杀毒");
    }
}
