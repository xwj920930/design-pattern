package com.pattern.design.decorator;

/**
 * @Description 抽象装饰类
 * @Author yuki
 * @Date 2019/4/17 10:33
 * @Version 1.0
 **/
public class ComponentDecorator extends Component {
    private Component component;
    public ComponentDecorator(Component component){
        this.component=component;
    }
    @Override
    public void display() {
        component.display();
    }
}
