package a13composite;

import java.util.ArrayList;

/**
 * 容器构件：文件夹类
 */
public class Folder extends AbstractFile {

    private String name;

    private ArrayList<AbstractFile> fileArrayList=new ArrayList<AbstractFile>();

    public Folder(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile file) {
        fileArrayList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileArrayList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileArrayList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对【文件夹】-"+name+"-进行杀毒");

        for (AbstractFile file : fileArrayList){
            file.killVirus();
        }
    }
}
