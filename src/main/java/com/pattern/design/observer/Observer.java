package com.pattern.design.observer;

/**
 * 抽象观察者/订阅
 * 声明方法：观察者被调用时回调
 */
public interface Observer {
    void update(String message);
}
