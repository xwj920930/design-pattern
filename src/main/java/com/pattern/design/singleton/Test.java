package com.pattern.design.singleton;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:54
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            new Thread(() -> System.out.println(Singleton1.getInstance().hashCode())).start();
//        }
//        for (int i=0;i<10;i++){
//            new Thread(() -> System.out.println(Singleton2.getInstance().hashCode())).start();
//        }
//        for (int i=0;i<10;i++){
//            new Thread(() -> System.out.println(Singleton3.getInstance().hashCode())).start();
//        }
        for (int i=0;i<10;i++){
            new Thread(() -> System.out.println(Singleton4.getInstance().hashCode())).start();
        }
    }
}
