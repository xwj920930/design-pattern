package com.pattern.design.mediator;

/**
 * @Description 抽象同事
 * @Author yuki
 * @Date 2019/4/26 9:40
 * @Version 1.0
 **/
public abstract class Person {
    protected String name;
    protected Mediator mediator;
    Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
