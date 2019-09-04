package com.pattern.design.singleton;

import java.util.concurrent.TimeUnit;

/**
 * @Description 懒汉模式，双重检验
 * @Author yuki
 * @Date 2019/3/29 16:56
 * @Version 1.0
 **/
public class Singleton4 {
    private static volatile Singleton4 singleton4;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if (singleton4==null){
            //费时的操作
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException ignored) {
            }
            synchronized (Singleton4.class){
                if (singleton4==null){
                    singleton4=new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
