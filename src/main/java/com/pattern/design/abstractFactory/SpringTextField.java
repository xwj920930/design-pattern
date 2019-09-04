package com.pattern.design.abstractFactory;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/4/1 9:36
 * @Version 1.0
 **/
public class SpringTextField implements ITextField {
    @Override
    public void Display() {
        System.out.println("绿色文本框");
    }
}
