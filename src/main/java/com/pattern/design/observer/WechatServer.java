package com.pattern.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体被观察者，微信公众号服务
 * @Author yuki
 * @Date 2019/4/19 17:44
 * @Version 1.0
 **/
public class WechatServer implements Observerable {
    //订阅者列表
    private List<Observer> observers;
    WechatServer(){
        observers=new ArrayList<>();
    }
    //增加订阅者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    //删除订阅者
    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty()){
            observers.remove(observer);
        }
    }
    //通知订阅者(遍历调用订阅者的反馈方法)
    @Override
    public void notifyObserver(String message) {
        System.out.println("微信服务更新消息："+message);
        observers.forEach(observer->observer.update(message));
    }
}
