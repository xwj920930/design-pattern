package com.pattern.design.composite;

/**
 * @Description 叶子构件
 * @Author yuki
 * @Date 2019/4/16 15:16
 * @Version 1.0
 **/
public class TextFile extends AbstractFile{
    private String name;
    TextFile(String name){
        this.name=name;
    }
    @Override
    public void add(AbstractFile file) {
    }
    @Override
    public void remove(AbstractFile file) {
    }
    @Override
    public AbstractFile getChild(int index) {
        return null;
    }
    @Override
    public void killVirus() {
        System.out.println("对文本文件"+name+"进行杀毒");
    }
}
