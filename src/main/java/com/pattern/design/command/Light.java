package com.pattern.design.command;

/**
 * @Description 接收者：灯
 * @Author yuki
 * @Date 2019/4/23 16:41
 * @Version 1.0
 **/
public class Light {
    public void on(){
        System.out.println("开灯");
    }
    public void off(){
        System.out.println("关灯");
    }
}
