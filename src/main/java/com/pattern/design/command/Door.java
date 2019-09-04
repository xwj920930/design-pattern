package com.pattern.design.command;

/**
 * @Description 接收者：门
 * @Author yuki
 * @Date 2019/4/23 16:42
 * @Version 1.0
 **/
public class Door {
    public void open(){
        System.out.println("开门");
    }
    public void close(){
        System.out.println("关门");
    }
}
