package com.pattern.design.decorator;

/**
 * @Description 具体构件：列表框
 * @Author yuki
 * @Date 2019/4/17 10:29
 * @Version 1.0
 **/
public class ListBox extends Component{
    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
