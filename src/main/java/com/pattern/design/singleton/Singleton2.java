package com.pattern.design.singleton;

/**
 * @Description 懒汉模式，同步方法/同步代码块
 * @Author yuki
 * @Date 2019/3/29 16:56
 * @Version 1.0
 **/
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if (singleton2==null){
                singleton2=new Singleton2();
            }
            return singleton2;
        }
    }
}
