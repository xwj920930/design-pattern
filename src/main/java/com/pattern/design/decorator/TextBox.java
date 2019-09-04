package com.pattern.design.decorator;

/**
 * @Description 具体构件：文本框
 * @Author yuki
 * @Date 2019/4/17 10:29
 * @Version 1.0
 **/
public class TextBox extends Component{
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
