package com.pattern.design.decorator;

/**
 * @Description 具体装饰类(最终继承自抽象构件)：黑色边框
 * @Author yuki
 * @Date 2019/4/17 10:39
 * @Version 1.0
 **/
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        //自下而上的调用
        super(component);
    }
    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }
    private void setBlackBorder(){
        System.out.println("为构件增加黑色边框");
    }
}
