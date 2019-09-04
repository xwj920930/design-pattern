package com.pattern.design.mediator;

/**
 * @Description 抽象中介者
 * @Author yuki
 * @Date 2019/4/26 9:31
 * @Version 1.0
 **/
public abstract class Mediator {
    //联络方法，收到person的消息以后转发给其他人
    public abstract void constact(String message,Person person);
}
