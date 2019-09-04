package com.pattern.design.singleton;

/**
 * @Description 饿汉模式，普通/静态代码块
 * @Author yuki
 * @Date 2019/3/29 16:46
 * @Version 1.0
 **/
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){}
    static {
        singleton1=new Singleton1();
    }
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
