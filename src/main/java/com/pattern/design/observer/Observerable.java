package com.pattern.design.observer;

/**
 * 抽象被观察者(发布)
 * 声明方法：订阅，取消订阅，通知观察者
 */
public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);
}
