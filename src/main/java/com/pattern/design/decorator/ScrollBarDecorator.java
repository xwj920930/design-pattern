package com.pattern.design.decorator;

/**
 * @Description 具体装饰类：滚动条
 * @Author yuki
 * @Date 2019/4/17 10:39
 * @Version 1.0
 **/
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }
    @Override
    public void display() {
        setScrollBar();
        super.display();
    }
    private void setScrollBar(){
        System.out.println("为构件增加滚动条");
    }
}
