package com.pattern.design.composite;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AbstractFile imageFolder=new FolderFile("外图片文件夹");
        AbstractFile innerImageFolder=new FolderFile("内图片文件夹");
        AbstractFile textFolder=new FolderFile("文档文件夹");
        AbstractFile image1=new ImageFile("1.jpg");
        AbstractFile image2=new ImageFile("2.png");
        AbstractFile image3=new ImageFile("3.gif");
        innerImageFolder.add(image1);
        innerImageFolder.add(image2);
        imageFolder.add(image3);
        imageFolder.add(innerImageFolder);
        AbstractFile text1=new TextFile("4.txt");
        AbstractFile text2=new TextFile("5.md");
        textFolder.add(text1);
        textFolder.add(text2);
        imageFolder.killVirus();
        textFolder.killVirus();
//        image1.killVirus();
    }
}
