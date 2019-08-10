package a13composite;


public class Client {

    public static void main(String[] args) {

        AbstractFile folder1=new Folder("lzp的资料");
        AbstractFile folder2=new Folder("图像文件");
        AbstractFile folder3=new Folder("文本文件");

        AbstractFile imageFile1=new ImageFile("小龙鱼.jpg");
        AbstractFile imageFile2=new ImageFile("张无机.jpg");

        TextFile textFile1=new TextFile("九阴正紧.txt");
        TextFile textFile2=new TextFile("葵花宝典.jpg");

        folder2.add(imageFile1);
        folder2.add(imageFile2);

        folder3.add(textFile1);
        folder3.add(textFile2);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.killVirus();

    }
}
