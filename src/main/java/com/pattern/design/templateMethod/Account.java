package com.pattern.design.templateMethod;

/**
 * @Description 抽象类
 * @Author yuki
 * @Date 2019/4/22 11:03
 * @Version 1.0
 **/
public abstract class Account {
    //父类实现
    protected void validate(){
        System.out.println("验证用户");
    }
    //子类实现
    protected abstract void caculateInterest();
    //父类实现
    protected void display(){
        System.out.println("显示利息");
    }
    //模板方法
    public void template(){
        validate();
        caculateInterest();
        display();
    }
}
