package com.pattern.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description jdk动态代理的使用
 * @Author yuki
 * @Date 2019/4/18 14:18
 * @Version 1.0
 **/
public class MyDynamicProxy implements InvocationHandler{
    private Object target;
    MyDynamicProxy(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("业务族A代理前");
        Object result = method.invoke(target, args);
        System.out.println("业务族A代理后");
        return result;
    }
    public <T>T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
