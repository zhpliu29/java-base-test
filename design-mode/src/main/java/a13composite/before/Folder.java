package a13composite.before;

import java.util.ArrayList;

/**
 * 文件夹类
 */
public class Folder {

    private String name;

    private ArrayList<Folder> folderArrayList=new ArrayList<Folder>();

    private ArrayList<ImageFile> imageFileArrayList=new ArrayList<ImageFile>();

    private ArrayList<TextFile> textFileArrayList=new ArrayList<TextFile>();

    public Folder(String name){
        this.name=name;
    }
    //添加成员
    public void addFolder(Folder folder){
        folderArrayList.add(folder);
    }

    public void addImageFile(ImageFile imageFile){
        imageFileArrayList.add(imageFile);
    }

    public void addTextFile(TextFile textFile){
        textFileArrayList.add(textFile);
    }

    //删除成员 ...

    //获取成员 ...

    //杀毒
    public void killVirus(){
        System.out.println("对【文件夹】-"+name+"-进行杀毒");

        for (Folder folder : folderArrayList){
            folder.killVirus();
        }

        for (ImageFile imageFile : imageFileArrayList){
            imageFile.killVirus();
        }

        for (TextFile textFile : textFileArrayList){
            textFile.killVirus();
        }
    }
}
