package com.pattern.design.singleton;

/**
 * @Description 懒汉模式，静态内部类
 * @Author yuki
 * @Date 2019/3/29 16:56
 * @Version 1.0
 **/
public class Singleton3 {
    private Singleton3(){}
    static class innerClass{
        private static Singleton3 singleton3=new Singleton3();
    }
    public static Singleton3 getInstance(){
        return innerClass.singleton3;
    }
}
