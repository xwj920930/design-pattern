package com.pattern.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 容器构件
 * @Author yuki
 * @Date 2019/4/16 15:16
 * @Version 1.0
 **/
public class FolderFile extends AbstractFile{
    private String name;
    private List<AbstractFile> files=new ArrayList<>();
    FolderFile(String name){
        this.name=name;
    }
    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }
    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }
    @Override
    public AbstractFile getChild(int index) {
        return files.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("对文件夹"+name+"进行杀毒");
        files.forEach(AbstractFile::killVirus);
    }
}
