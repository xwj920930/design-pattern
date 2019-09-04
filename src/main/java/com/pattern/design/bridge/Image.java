package com.pattern.design.bridge;

/**
 * @Description 继承维度代表png，jpg
 * @Author yuki
 * @Date 2019/4/15 10:13
 * @Version 1.0
 **/
public abstract class Image {
    protected ImageImplementor imageImplementor;
    Image(ImageImplementor imageImplementor){
        this.imageImplementor=imageImplementor;
    }
    public abstract void draw();
}
