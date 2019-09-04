package com.pattern.design.observer;

/**
 * @Description 观察者
 * @Author yuki
 * @Date 2019/4/21 20:17
 * @Version 1.0
 **/
public class User implements Observer{
    private String name;
    User(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+"收到信息："+message);
    }
}
