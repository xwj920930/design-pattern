package com.pattern.design.bridge;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/15 10:20
 * @Version 1.0
 **/
public class PNGImage extends Image {
    PNGImage(ImageImplementor imageImplementor) {
        super(imageImplementor);
    }
    @Override
    public void draw() {
        super.imageImplementor.doPrint();
        System.out.println("png");
    }
}
