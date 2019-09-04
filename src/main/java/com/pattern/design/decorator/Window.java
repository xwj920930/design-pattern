package com.pattern.design.decorator;

/**
 * @Description 具体构件：窗体
 * @Author yuki
 * @Date 2019/4/17 10:29
 * @Version 1.0
 **/
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
