package com.pattern.design.prototype;

import java.util.Date;

/**
 * @Description TODO
 * @Author yuki
 * @Date 2019/3/29 16:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Date date=new Date(123456789L);
        Circle circle1=new Circle("1",date);
        System.out.println("1改变前"+circle1);
        Circle circle2=null;
        try {
            circle2 = (Circle) circle1.clone();
            System.out.println("克隆2"+circle2);
            circle2.getTime().setTime(111111111L);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("1改变后"+circle1);
    }
}
