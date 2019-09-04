package com.pattern.design.composite;

/**
 * @Description 抽象构件
 * @Author yuki
 * @Date 2019/4/16 15:13
 * @Version 1.0
 **/
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int index);
    public abstract void killVirus();
}
