package com.pattern.design.bridge;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Image pngImage=new PNGImage(new LinuxImplementor());
        pngImage.draw();
        Image jpgImage = new JPGImage(new WindowsImplementor());
        jpgImage.draw();
    }
}
