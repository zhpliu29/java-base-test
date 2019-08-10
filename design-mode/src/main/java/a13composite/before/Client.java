package a13composite.before;

public class Client {

    public static void main(String[] args) {

        Folder folder1=new Folder("lzp的资料");
        Folder folder2=new Folder("图像文件");
        Folder folder3=new Folder("文本文件");

        ImageFile imageFile1=new ImageFile("小龙鱼.jpg");
        ImageFile imageFile2=new ImageFile("张无机.jpg");

        TextFile textFile1=new TextFile("九阴正紧.txt");
        TextFile textFile2=new TextFile("葵花宝典.jpg");

        folder2.addImageFile(imageFile1);
        folder2.addImageFile(imageFile2);

        folder3.addTextFile(textFile1);
        folder3.addTextFile(textFile2);

        folder1.addFolder(folder2);
        folder1.addFolder(folder3);
        folder1.killVirus();

    }
}
