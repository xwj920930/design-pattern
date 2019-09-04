package com.pattern.design.bridge;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/15 10:22
 * @Version 1.0
 **/
public class WindowsImplementor implements ImageImplementor {
    @Override
    public void doPrint() {
        System.out.println("windows");
    }
}
