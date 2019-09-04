package com.pattern.design.decorator;

/**
 * @Description 抽象构件，构件不能装饰上构件，只能装饰上装饰类
 * 因为构件作为根没有上级类，无法再继续自下而上的调用了
 * @Author yuki
 * @Date 2019/4/17 10:28
 * @Version 1.0
 **/
public abstract class Component {
    public abstract void display();
}
