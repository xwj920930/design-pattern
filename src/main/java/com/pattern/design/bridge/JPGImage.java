package com.pattern.design.bridge;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/15 10:18
 * @Version 1.0
 **/
public class JPGImage extends Image {
    JPGImage(ImageImplementor imageImplementor) {
        super(imageImplementor);
    }
    @Override
    public void draw() {
        super.imageImplementor.doPrint();
        System.out.println("jpg");
    }
}
