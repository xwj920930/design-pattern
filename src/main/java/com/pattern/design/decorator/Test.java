package com.pattern.design.decorator;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //未构建组件
        Component window=new Window();
        window.display();
        //构建入滚动条
        ScrollBarDecorator scrollBar = new ScrollBarDecorator(window);
        scrollBar.display();
        //构建入黑色边框，三者为链式结构，均继承自component，display顺序为border-》bar-》window，
        // 他们并不属于一个对象内的属性
        BlackBorderDecorator blackBorder = new BlackBorderDecorator(scrollBar);
        blackBorder.display();
    }
}
